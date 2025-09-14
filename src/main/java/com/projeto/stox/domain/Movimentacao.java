package com.projeto.stox.domain;

public class Movimentacao {

    private int id;
    private String entradaDeProdutos;
    private String quantidadeParaEntregar;
    private String quantidadeSeparada;
    
    private String saidaDeProdutos;
    private String quantidadeMovimentadaDia;
    private String estoqueTotal;

public Movimentacao(String entradaDeProdutos, String quantidadeParaEntregar, String quantidadeSeparada, String quantidadeComAvaria, String saidaDeProdutos, String quantidadeMovimentadaDia, String estoqueTotal) {
    this.entradaDeProdutos = entradaDeProdutos;
    this.quantidadeParaEntregar = quantidadeParaEntregar;
    this.quantidadeSeparada = quantidadeSeparada;
    this.quantidadeComAvaria = quantidadeComAvaria;
    this.saidaDeProdutos = saidaDeProdutos;
    this.quantidadeMovimentadaDia = quantidadeMovimentadaDia;
    this.estoqueTotal = estoqueTotal;
}

public void setEntradaDeProdutos(String entradaDeProdutos) {
    this.entradaDeProdutos = entradaDeProdutos;
}
public String getEntradaDeProdutos() {
    return this.entradaDeProdutos;
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

public void setQuantidadeComAvaria(String quantidadeComAvaria) {
    this.quantidadeComAvaria = quantidadeComAvaria;
}
public String getQuantidadeComAvaria() {
    return this.quantidadeSeparada;
}

public void setSaidaDeProdutos(String saidaDeProdutos) {
    this.saidaDeProdutos = saidaDeProdutos;
}
public String getSaidaDeProdutos() {
    return this.saidaDeProdutos;
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
