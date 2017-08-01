/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.ads.controller;

import ifpb.ads.entity.livro.Livro;
import ifpb.ads.persist.jdbc.LivroDaoJDBC;
import ifpb.ads.persist.model.LivroDao;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author miolivc
 */

@Named
@SessionScoped
public class LivroManager implements Serializable {
    
    private Livro livro = new Livro();
    private LivroDao manager = new LivroDaoJDBC();

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
    
    public String addLivro() {
        manager.add(livro);
        return null;
    }
    
}
