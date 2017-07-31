/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.ads.persist.jdbc;

import ifpb.ads.persist.model.LivroDao;
import ifpb.ads.entity.livro.Livro;
import java.sql.Connection;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
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
        
    }

    @Override
    public void delete(String ISBN) {
        
    }

    @Override
    public void edit(Livro livro) {
        
    }

    @Override
    public Livro search(String ISBN) {
        return null;
    }

    @Override
    public List<Livro> list() {
        return Collections.EMPTY_LIST;
    }
    
}
