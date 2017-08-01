/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.ads.persist.jdbc;

import ifpb.ads.entity.emprestimo.Emprestimo;
import ifpb.ads.persist.model.EmprestimoDao;

/**
 *
 * @author miolivc
 */
public class EmprestimoDaoJDBC implements EmprestimoDao {

    @Override
    public void emprestar(Emprestimo emprestimo) {
        throw new RuntimeException();
    }
    
    @Override
    public void devolver(Emprestimo emprestimo) {
        throw new RuntimeException();
    }
}
