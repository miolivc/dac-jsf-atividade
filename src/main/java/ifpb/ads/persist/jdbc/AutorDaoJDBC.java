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
import java.util.Collections;
import java.util.List;
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
        
    }

    @Override
    public void delete(CPF cpf) {
        
    }

    @Override
    public void edit(Autor autor) {
        
    }

    @Override
    public Autor search(CPF cpf) {
        return null;
    }

    @Override
    public List<Autor> list() {
        return Collections.EMPTY_LIST;
    }
    
    
}
