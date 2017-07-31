package ifpb.ads.entity.livro;

import ifpb.ads.entity.autor.Autor;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 17/06/2017, 12:25:12
 */
public class Livro implements Serializable {

    private String descricao;
    private String ISBN;
    private String edicao;
    private List<Autor> autores;

    public Livro() {
        this.autores = new ArrayList<>();
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }
    
    public void adicionarAutor(Autor autor){
        this.autores.add(autor);
    }
    public void removerAutor(Autor autor){
        this.autores.remove(autor);
    }

}
