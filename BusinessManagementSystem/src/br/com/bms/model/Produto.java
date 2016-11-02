package br.com.bms.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Classe Produto. 
 * 
 * @since 19/04/2014
 * @version v1.1 16/06/2014
 * @author Bruno Bitencourt Luiz
 */
public class Produto extends Ofertado{

    private boolean venderEstoqueZerado;
    private boolean controleEstoque;
    private String unidade;
    private Marca marca;

    public boolean isVenderEstoqueZerado() {
        return venderEstoqueZerado;
    }

    public void setVenderEstoqueZerado(boolean venderEstoqueZerado) {
        this.venderEstoqueZerado = venderEstoqueZerado;
    }

    public boolean isControleEstoque() {
        return controleEstoque;
    }

    public void setControleEstoque(boolean controleEstoque) {
        this.controleEstoque = controleEstoque;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    
    
}
