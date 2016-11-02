package br.com.bms.model;

/**
 * Classe abstrata Pessoa Jurídica. 
 * 
 * @since: 15/04/2014
 * @version v1.1 19/04/2014
 * @author Bruno Bitencourt Luiz
 */
public abstract class PessoaJuridica extends Pessoa {

    private String Ie;
    private String Cnpj;
    private String razaoSocial;

    public String getIe() {
        return Ie;
    }

    public void setIe(String Ie) {
        this.Ie = Ie;
    }

    public String getCnpj() {
        return Cnpj;
    }

    public void setCnpj(String Cnpj) {
        this.Cnpj = Cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

}