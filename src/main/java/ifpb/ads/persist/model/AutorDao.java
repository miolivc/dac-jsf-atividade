/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.ads.persist.model;

import ifpb.ads.entity.autor.Autor;
import ifpb.ads.entity.autor.CPF;
import java.util.List;

/**
 *
 * @author miolivc
 */
public interface AutorDao {
    
    void add(Autor autor);
    void delete(CPF cpf);
    void edit(Autor autor);
    Autor search(CPF cpf);
    List<Autor> list();
    
}
