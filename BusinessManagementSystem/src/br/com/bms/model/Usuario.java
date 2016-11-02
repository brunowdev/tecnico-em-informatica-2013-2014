package br.com.bms.model;

/**
 * Classe Usuário.
 *
 * @since: 19/04/2014
 * @version v1.1 22/04/2014
 * @author Bruno Bitencourt Luiz
 */
class Usuario {

    private long id;
    private String nome;
    private String email;
    private Login login;
    private Senha senha;
    private int status;
    private int nivelAcesso;
    private String ultimoAcesso;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public Senha getSenha() {
        return senha;
    }

    public void setSenha(Senha senha) {
        this.senha = senha;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(int nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public String getUltimoAcesso() {
        return ultimoAcesso;
    }

    public void setUltimoAcesso(String ultimoAcesso) {
        this.ultimoAcesso = ultimoAcesso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nome=" + nome + ", email=" + email
                + ", login=" + login + ", senha=" + senha + ", status="
                + status + ", nivelAcesso=" + nivelAcesso + ", ultimoAcesso="
                + ultimoAcesso + '}';
    }
}
