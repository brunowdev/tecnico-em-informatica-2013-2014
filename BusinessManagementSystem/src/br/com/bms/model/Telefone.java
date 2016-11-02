package br.com.bms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Classe Telefone.
 *
 * @since 19/04/2014
 * @version v1.1 26/04/2014
 * @author Bruno Bitencourt Luiz
 */
@Entity
public class Telefone {
    
    @Id
    @GeneratedValue
    private int id;
    private String telefone;
    
    @ManyToOne
    @JoinColumn(name = "PESSOA_ID") 
    private Pessoa pessoa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
}