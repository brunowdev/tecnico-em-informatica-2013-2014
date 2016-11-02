package br.com.bms.model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Bruno Luiz
 */
public class NotaFiscal {

    private int id;

    private enum status {
        Aberta, Finalizada, Cancelada
    }
    private String observacoes;
    private double valorTotal;
    private Date dataEmissao;
    private Date dataPagamento;
    private String auditoriaLog;
    private List<ItemNotaFiscal> itens;
    private int idFuncionario;
    private int idCliente;
    private int idTipoPagamento;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getAuditoriaLog() {
        return auditoriaLog;
    }

    public void setAuditoriaLog(String auditoriaLog) {
        this.auditoriaLog = auditoriaLog;
    }

    public List<ItemNotaFiscal> getItens() {
        return itens;
    }

    public void setItens(List<ItemNotaFiscal> itens) {
        this.itens = itens;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdTipoPagamento() {
        return idTipoPagamento;
    }

    public void setIdTipoPagamento(int idTipoPagamento) {
        this.idTipoPagamento = idTipoPagamento;
    }
}