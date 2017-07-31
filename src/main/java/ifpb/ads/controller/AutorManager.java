/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.ads.controller;

import ifpb.ads.entity.autor.Autor;
import ifpb.ads.persist.model.AutorDao;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author miolivc
 */
@Named
@SessionScoped
public class AutorManager implements Serializable {
    
    @Inject 
    private Autor autor;
    @Inject
    private AutorDao manager;

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    public String addAutor() {
        manager.add(autor);
        return null;
    }
    
}
