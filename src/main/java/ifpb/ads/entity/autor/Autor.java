package ifpb.ads.entity.autor;

import java.io.Serializable;
import javax.enterprise.inject.Produces;
import javax.inject.Named;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 17/06/2017, 12:22:51
 */

@Named
public class Autor implements Serializable {

    private String nome;
    private String email;
    private CPF cpf;

    public Autor() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CPF getCpf() {
        return cpf;
    }

    public void setCpf(CPF cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
