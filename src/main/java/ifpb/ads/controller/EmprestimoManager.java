/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.ads.controller;

import ifpb.ads.entity.emprestimo.Emprestimo;
import ifpb.ads.persist.jdbc.EmprestimoDaoJDBC;
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
    
    private Emprestimo emprestimo = new Emprestimo();
    private EmprestimoDao manager = new EmprestimoDaoJDBC();

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }
    
    public String addEmprestimo() {
        manager.emprestar(emprestimo);
        return null;
    }
    
}
