package com.projeto.stox.domain;

import java.util.Date;

public class Produto {
    private int id;
    private String nome;
    private String descricao;
    private Date dataDeVenciamento;
    private double preco;
    private Fornecedor fornecedor;
    private TipoProduto tipoProduto;

public Produto(String nome, String descricao, Date dataDeVencimento, double preco){
    this.nome = nome;
    this.descricao = descricao;
    this.dataDeVenciamento = dataDeVencimento;
    this.preco = preco;
}

public void setNome(String nome) {
        this.nome = nome;
}
public String getNome() {
        return this.nome;    
}

public void setDescricao(String descricao) {
        this.descricao = descricao;
}
public String getDescricao() {
        return this.descricao;
}

public void setDataDeVencimento(Date dataDeVencimento) {
        this.dataDeVenciamento = dataDeVencimento;
}
public Date getDataDeVencimento() {
       return this.dataDeVenciamento;
}

public void setPreco(double preco) {
        this.preco = preco;
}    
public double getPreco() {
        return this.preco;
}

public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
}
public Fornecedor getFornecedor() {
        return this.fornecedor;
}

public void setTipoProduto(TipoProduto tipoProduto) {
        this.tipoProduto = tipoProduto;
}
public TipoProduto getTipoProduto() {
        return this.tipoProduto;
}
}
