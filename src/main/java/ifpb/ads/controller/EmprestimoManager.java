/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.ads.controller;

import ifpb.ads.entity.emprestimo.Emprestimo;
import ifpb.ads.persist.model.EmprestimoDao;
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
public class EmprestimoManager implements Serializable {
    
    @Inject
    private Emprestimo emprestimo;
    @Inject
    private EmprestimoDao manager;

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }
    
    public String addEmprestimo() {
        manager.add(emprestimo);
        return null;
    }
    
}
