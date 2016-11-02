package br.com.bms.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Classe cliente Físico.
 *
 * @since 15/04/2014
 * @version v1.0 15/07/2014
 * @author Bruno Bitencourt Luiz
 */
@Entity
@PrimaryKeyJoinColumn(name = "CF_ID")
public class ClienteFisico extends Pessoa {

    @Column(unique = true)
    private String cpf;
    private String rg;
    private String descricao;
    private int sexo;
    @Temporal(TemporalType.DATE)
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
    
    
}
