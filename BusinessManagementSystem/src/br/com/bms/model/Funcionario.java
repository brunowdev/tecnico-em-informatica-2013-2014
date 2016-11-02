package br.com.bms.model;

import java.util.Date;

/**
 * Classe Funcionário.
 *
 * @since: 19/04/2014
 * @version v1.2 19/04/2014
 * @author Bruno Bitencourt Luiz
 */
public class Funcionario extends PessoaFisica {

    private Date dataAd;
    private Date dataDe;
    private Usuario usuario;
    private String numeroPis;
    private String numeroConta;
    private String agenciaNome;
    private String agenciaNumero;
    private Double salario;
    private int numeroDependentes;
    private String ctps;

    public Date getDataAd() {
        return dataAd;
    }

    public void setDataAd(Date dataAd) {
        this.dataAd = dataAd;
    }

    public Date getDataDe() {
        return dataDe;
    }

    public void setDataDe(Date dataDe) {
        this.dataDe = dataDe;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getNumeroPis() {
        return numeroPis;
    }

    public void setNumeroPis(String numeroPis) {
        this.numeroPis = numeroPis;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agenciaNome;
    }

    public void setAgencia(String agencia) {
        this.agenciaNome = agencia;
    }

    public String getAgenciaNome() {
        return agenciaNome;
    }

    public void setAgenciaNome(String agenciaNome) {
        this.agenciaNome = agenciaNome;
    }

    public String getAgenciaNumero() {
        return agenciaNumero;
    }

    public void setAgenciaNumero(String agenciaNumero) {
        this.agenciaNumero = agenciaNumero;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public int getNumeroDependentes() {
        return numeroDependentes;
    }

    public void setNumeroDependentes(int numeroDependentes) {
        this.numeroDependentes = numeroDependentes;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

}
