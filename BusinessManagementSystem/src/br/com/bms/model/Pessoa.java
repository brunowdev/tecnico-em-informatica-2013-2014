package br.com.bms.model;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Molde para as classes que se estendem de Pessoa.
 * Desde a versão 1.8 foram adicionadas as anotações do Framework de persistência.
 * Foi implementada a herança do tipo JOINED.
 *  
 * 
 * @since 15/04/2014
 * @version v1.8 15/07/2014
 * @author Bruno Bitencourt Luiz
 */

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String apelido;
    private String observacoes;
    private String paginaSocial;
    private String email;
  
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCadastro;
    private enum situacao {A, I, B};
  
//    @OneToOne (optional = true)
//    private Endereco endereco;
//   
//    @OneToMany(mappedBy = "pessoa")
//    private List<Telefone> telefones;
//   
//    @OneToOne (optional = true)
//    private Foto foto;

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

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getPaginaSocial() {
        return paginaSocial;
    }

    public void setPaginaSocial(String paginaSocial) {
        this.paginaSocial = paginaSocial;
    }

//    public Endereco getEndereco() {
//        return endereco;
//    }
//
//    public void setEndereco(Endereco endereco) {
//        this.endereco = endereco;
//    }
//
//    public Foto getFoto() {
//        return foto;
//    }
//
//    public void setFoto(Foto foto) {
//        this.foto = foto;
//    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


//    public List<Telefone> getTelefones() {
//        return telefones;
//    }
//
//    public void setTelefones(List<Telefone> telefones) {
//        this.telefones = telefones;
//    }

}
