package br.com.bms.model;

/**
 * Classe Senha
 *
 * @since: 19/04/2014
 * @version v1.0 19/04/2014
 * @author Bruno Bitencourt Luiz
 */
public class Senha {

    private long id;
    private String senha;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
