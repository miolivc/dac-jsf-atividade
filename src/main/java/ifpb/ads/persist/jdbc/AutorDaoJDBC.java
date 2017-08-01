/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.ads.persist.jdbc;

import ifpb.ads.entity.autor.Autor;
import ifpb.ads.entity.autor.CPF;
import ifpb.ads.persist.model.AutorDao;
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
public class AutorDaoJDBC implements AutorDao {
    @Inject
    private Connection connection;

    @Override
    public void add(Autor autor) {
        try {
            String sql = "INSERT INTO AUTOR(CPF, NOME, EMAIL) VALUES (?,?,?)";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, autor.getCpf().valor());
            stmt.setString(2, autor.getNome());
            stmt.setString(3, autor.getEmail());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AutorDaoJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(CPF cpf) {
        try {
            String sql = "DELETE FROM AUTOR WHERE CPF = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1,cpf.valor());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AutorDaoJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void edit(Autor autor) {
        try {
            String sql = "UPDATE FROM AUTOR SET CPF = ?, NOME = ?, EMAIL = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1,autor.getCpf().valor());
            stmt.setString(2,autor.getNome());
            stmt.setString(3,autor.getEmail());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AutorDaoJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Autor search(CPF cpf) {
        try {
            String sql = "SELECT * FROM AUTOR WHERE CPF = " + cpf.valor() ;
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            Autor autor = new Autor();
            while(rs.next()) {
                autor.setCpf(new CPF(rs.getString("cpf")));
                autor.setNome(rs.getString("nome"));
                autor.setEmail(rs.getString("email"));
            }
            return autor;
        } catch (SQLException ex) {
            Logger.getLogger(AutorDaoJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public List<Autor> list() {
        try {
            String sql = "SELECT * FROM AUTOR";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            List<Autor> autores = new ArrayList<>();
            while(rs.next()) {
                Autor autor = new Autor();
                autor.setCpf(new CPF(rs.getString("cpf")));
                autor.setNome(rs.getString("nome"));
                autor.setEmail(rs.getString("email"));
                autores.add(autor);
            }
            return autores;
        } catch (SQLException ex) {
            Logger.getLogger(AutorDaoJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Collections.EMPTY_LIST;
    }
    
    
}
