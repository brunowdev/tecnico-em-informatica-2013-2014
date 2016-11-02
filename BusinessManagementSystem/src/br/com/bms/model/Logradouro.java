package br.com.bms.model;

/**
 * Classe Rua.
 *
 * @since: 24/04/2014
 * @version v1.1 24/04/2014
 * @author Bruno Bitencourt Luiz
 */
public class Logradouro {

    private long id;
    private String nome;
    private String cep;
    private int estado;
    private String estadoSigla;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getEstadoSigla() {
        return estadoSigla;
    }

    public void setEstadoSigla(String estadoSigla) {
        this.estadoSigla = estadoSigla;
    }

    @Override
    public String toString() {
        return "Logradouro{" + "id=" + id
                + ", nome=" + nome + ", cep=" + cep + ", estado=" + estado
                + ", estadoSigla=" + estadoSigla + '}';
    }

}
