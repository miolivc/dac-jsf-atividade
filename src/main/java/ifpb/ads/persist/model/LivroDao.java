/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.ads.persist.model;

import ifpb.ads.entity.livro.Livro;
import java.util.List;

/**
 *
 * @author miolivc
 */
public interface LivroDao {
    
    void add(Livro livro);
    void delete(String ISBN);
    void edit(Livro livro);
    Livro search(String ISBN);
    List<Livro> list();
    
}
