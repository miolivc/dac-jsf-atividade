/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.ads.persist.jdbc;

import ifpb.ads.persist.model.LivroDao;
import ifpb.ads.entity.livro.Livro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Inject;

/**
 *
 * @author miolivc
 */
public class LivroDaoJDBC implements LivroDao {
    @Inject
    private Connection connection;
    
    @Override
    public void add(Livro livro) {
        try {
            String sql = "INSERT INTO LIVRO(ISBN, DESCRICAO, EDICAO) VALUES (?,?,?)";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, livro.getISBN());
            stmt.setString(2, livro.getDescricao());
            stmt.setString(3, livro.getEdicao());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(LivroDaoJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(String ISBN) {
        try {
            String sql = "DELETE FROM LIVRO WHERE ISBN = " + ISBN;
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(LivroDaoJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void edit(Livro livro) {
        delete(livro.getISBN());
        add(livro);
    }

    @Override
    public Livro search(String ISBN) {
        try {
            String sql = "SELECT * FROM LIVRO WHERE ISBN = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            Livro livro = new Livro();
            while(rs.next()) {
                livro.setISBN(rs.getString("ISBN"));
                livro.setDescricao(rs.getString("DESCRICAO"));
                livro.setEdicao(rs.getString("EDICAO"));
            }
            return livro;
        } catch (SQLException ex) {
            Logger.getLogger(LivroDaoJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public List<Livro> list() {
        try {
            String sql = "SELECT * FROM LIVRO WHERE ISBN = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            List<Livro> livros = new ArrayList<>();
            while(rs.next()) {
                Livro livro = new Livro();
                livro.setISBN(rs.getString("ISBN"));
                livro.setDescricao(rs.getString("DESCRICAO"));
                livro.setEdicao(rs.getString("EDICAO"));
                livros.add(livro);
            }
            return livros;
        } catch (SQLException ex) {
            Logger.getLogger(LivroDaoJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Collections.EMPTY_LIST;
    }
    
}
