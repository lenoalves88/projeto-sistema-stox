package com.projeto.stox.domain;

public class Movimentacao {

    private int id;
    private String quantidadeParaEntregar;
    private String quantidadeSeparada;
    private String saida;
    private String observacao;
    private String quantidadeMovimentadaDia;
    private String estoqueTotal;

public Movimentacao(String quantidadeParaEntregar, String quantidadeSeparada, String saida, String observacao, String quantidadeMovimentadaDia, String estoqueTotal) {
    
    this.quantidadeParaEntregar = quantidadeParaEntregar;
    this.quantidadeSeparada = quantidadeSeparada;
    this.saida = saida;
    this.observacao = observacao;
    this.quantidadeMovimentadaDia = quantidadeMovimentadaDia;
    this.estoqueTotal = estoqueTotal;
}

public void setQuantidadeParaEntregar(String quantidadeParaEntregar) {
    this.quantidadeParaEntregar = quantidadeParaEntregar;
}
public String getQuantidadeParaEntregar() {
    return this.quantidadeParaEntregar;
}

public void setQuantidadeSeparada(String quantidadeSeparada) {
    this.quantidadeSeparada = quantidadeSeparada;
}
public String getQuantidadeSeparada() {
    return this.quantidadeSeparada;
}

public void setSaida(String saidaDeProdutos) {
    this.saida = saida;
}
public String getSaida() {
    return this.saida;
}

public void setObservacao(String observacao) {
    this.observacao = observacao;
}
public String getObservacao() {
    return this.observacao;
}

public void setQuantidadeMovimentadaDia(String quantidadeMovimentadaDia) {
    this.quantidadeMovimentadaDia = quantidadeMovimentadaDia;
}

public String getQuantidadeMovimentadaDia() {
    return this.quantidadeMovimentadaDia;
}

public void setEstoqueTotal(String estoqueTotal) {
    this.estoqueTotal = estoqueTotal;
}
public String getEstoqueTotal() {
    return this.estoqueTotal;
}
}
