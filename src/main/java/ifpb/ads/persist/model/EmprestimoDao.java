/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.ads.persist.model;

import ifpb.ads.entity.emprestimo.Emprestimo;

/**
 *
 * @author miolivc
 */
public interface EmprestimoDao {
    
    void emprestar(Emprestimo emprestimo);
    void devolver(Emprestimo emprestimo);
}
