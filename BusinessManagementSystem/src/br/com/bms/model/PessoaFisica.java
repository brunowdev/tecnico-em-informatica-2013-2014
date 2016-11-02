package br.com.bms.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Classe abstrata Pessoa Física.
 *
 * @since: 15/04/2014
 * @version v1.1 19/04/2014
 * @author Bruno Bitencourt Luiz
 */
public abstract class PessoaFisica extends Pessoa {

    @Column(unique = true)
    private String cpf;
    private String rg;
    private String descricao;
    private int sexo;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataNascimento;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" + "cpf=" + cpf + ", rg=" + rg + ", descricao=" + descricao + ", sexo=" + sexo + ", dataNascimento=" + dataNascimento + '}';
    }

}
