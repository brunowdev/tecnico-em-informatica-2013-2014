package br.com.bms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Classe Cargo.
 *
 * @since 19/04/2014
 * @version v1.1 15/07/2014
 * Adicionadas anotações JPA.
 * @author Bruno Bitencourt Luiz
 */
@Entity
public class Cargo {
    @Id
    @GeneratedValue
    private int id;
    @Column(length = 30, nullable = false, unique = true)
    private String nome;
    @Column(length = 70, nullable = false)
    private String descricao;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Cargo{" + "id=" + id + 
                ", nome=" + nome + 
                ", descricao=" + descricao + '}';
    }

}
