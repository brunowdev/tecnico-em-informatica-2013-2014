package br.com.bms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

/**
 * Classe abstrata Ofertado.
 *
 * @since 16/06/2014
 * @version v1.0 15/07/2014
 * @author Bruno Bitencourt Luiz
 */
public abstract class Ofertado {
    
    private int id;
    private String nome;
    private String especificacao;
    private String descricao;
    private double precoAvista;
    private double precoAprazo;
    private double precoAtacado;
    private double percentualAvista;
    private double percentualAtacado;
    private double percentualAprazo;
    private enum tipo {
        P, S
    }
    private boolean venderAprazo;
    private Foto foto;

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecificacao() {
        return especificacao;
    }

    public void setEspecificacao(String especificacao) {
        this.especificacao = especificacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoAvista() {
        return precoAvista;
    }

    public void setPrecoAvista(double precoAvista) {
        this.precoAvista = precoAvista;
    }

    public double getPrecoAprazo() {
        return precoAprazo;
    }

    public void setPrecoAprazo(double precoAprazo) {
        this.precoAprazo = precoAprazo;
    }

    public double getPrecoAtacado() {
        return precoAtacado;
    }

    public void setPrecoAtacado(double precoAtacado) {
        this.precoAtacado = precoAtacado;
    }

    public double getPercentualAvista() {
        return percentualAvista;
    }

    public void setPercentualAvista(double percentualAvista) {
        this.percentualAvista = percentualAvista;
    }

    public double getPercentualAtacado() {
        return percentualAtacado;
    }

    public void setPercentualAtacado(double percentualAtacado) {
        this.percentualAtacado = percentualAtacado;
    }

    public double getPercentualAprazo() {
        return percentualAprazo;
    }

    public void setPercentualAprazo(double percentualAprazo) {
        this.percentualAprazo = percentualAprazo;
    }

    public boolean isVenderAprazo() {
        return venderAprazo;
    }

    public void setVenderAprazo(boolean venderAprazo) {
        this.venderAprazo = venderAprazo;
    }

    public Foto getFoto() {
        return foto;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }

}
