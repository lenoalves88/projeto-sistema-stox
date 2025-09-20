package com.projeto.stox.domain;

import java.util.Date;

public class Movimentacao {

    private int id;
    private String quantidadeParaEntregar;
    private String quantidadeSeparada;
    private Date prazoSaidaEm;
    private String observacao;
    private String quantidadeMovimentadaDia;
    private String estoqueTotal;
    private TipoMovimentacao tipoMovimentacao;

public Movimentacao(String quantidadeParaEntregar, String quantidadeSeparada, Date prazoSaidaEm, String observacao, String quantidadeMovimentadaDia, String estoqueTotal) {
    
    this.quantidadeParaEntregar = quantidadeParaEntregar;
    this.quantidadeSeparada = quantidadeSeparada;
    this.prazoSaidaEm = prazoSaidaEm;
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

public void setPrazoSaidaEm(Date prazoSaidaEm) {
    this.prazoSaidaEm = prazoSaidaEm;
}
public Date getPrazoSaidaEm() {
    return this.prazoSaidaEm;
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

public void setTipoMovimentacao(TipoMovimentacao tipoMovimentacao) {
    this.tipoMovimentacao = tipoMovimentacao;
}
public TipoMovimentacao getTipoMovimentacao() {
    return this.tipoMovimentacao;
}
}
