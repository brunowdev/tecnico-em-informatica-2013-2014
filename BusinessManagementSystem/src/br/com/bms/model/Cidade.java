package br.com.bms.model;

/**
 * Classe Cidade.
 *
 * @since: 19/04/2014
 * @version v1.0 19/04/2014
 * @author Bruno Bitencourt Luiz
 */
public class Cidade {

    private int id;
    private String nome;
    private int estado;
    private String sigla;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return "Cidade{" + "id=" + id + ", nome=" + nome + ", estado=" + estado + '}';
    }

}
