package br.com.bms.model;

/**
 * Classe Endereço.
 *
 * @since: 15/04/2014
 * @version v1.1 24/04/2014
 * @author Bruno Bitencourt Luiz
 */
public class Endereco {

    private long id;
    private String numeroCasa;
    private int tipoImovel;
    private Cidade cidade;
    private Bairro bairro;
    private Logradouro logradouro;
    private int estado;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public int getTipoImovel() {
        return tipoImovel;
    }

    public void setTipoImovel(int tipoImovel) {
        this.tipoImovel = tipoImovel;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Logradouro getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(Logradouro logradouro) {
        this.logradouro = logradouro;
    }

}
