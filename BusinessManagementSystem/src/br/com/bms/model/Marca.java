package br.com.bms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Classe Marca.
 *
 * @since: 19/04/2014
 * @version v1.1 15/07/2014
 * @author Bruno Bitencourt Luiz
 */
//@Entity
public class Marca {

    private int id;
    private String nome;

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

}
