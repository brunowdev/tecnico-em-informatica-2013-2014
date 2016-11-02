package br.com.bms.model;

import java.util.Date;

/**
 * Classe Caixa.
 *
 * @since 15/07/2014
 * @version v1.0 15/07/2014
 * @author Bruno Bitencourt Luiz
 */
public class Caixa {

    private int id;
    private double totalEntradas;
    private double totalSaidas;
    private double totalReceber;
    private Date dataAbertura;
    private Date dataFechamento;

    private enum status {
        A, F
    }

    private enum periodo {
        D, M, S, P, O
    }

    public int getId() {
        return id;
    }

    public double getTotalEntradas() {
        return totalEntradas;
    }

    public void setTotalEntradas(double totalEntradas) {
        this.totalEntradas = totalEntradas;
    }

    public double getTotalSaidas() {
        return totalSaidas;
    }

    public void setTotalSaidas(double totalSaidas) {
        this.totalSaidas = totalSaidas;
    }

    public double getTotalReceber() {
        return totalReceber;
    }

    public void setTotalReceber(double totalReceber) {
        this.totalReceber = totalReceber;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public Date getDataFechamento() {
        return dataFechamento;
    }

    public void setDataFechamento(Date dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

}
