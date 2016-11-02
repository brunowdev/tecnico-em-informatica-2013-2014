package br.com.bms.model;

/**
 * Classe molde para os itens da nota fiscal.
 *
 * @since: 16/06/2014
 * @version v1.0 16/06/2014
 * @author Bruno Bitencourt Luiz
 */
public class ItemNotaFiscal {

    private int id;
    private int qtd;
    private double descontoUnitario;
    private double precoUnitario;
    private int IdNotaFiscal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getDescontoUnitario() {
        return descontoUnitario;
    }

    public void setDescontoUnitario(double descontoUnitario) {
        this.descontoUnitario = descontoUnitario;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getIdNotaFiscal() {
        return IdNotaFiscal;
    }

    public void setIdNotaFiscal(int IdNotaFiscal) {
        this.IdNotaFiscal = IdNotaFiscal;
    }
}