package com.projeto.stox.domain;

public class TipoMovimentacao {

    private int id;
    private String nome;
    private int fatorMultiplicativo;
    
public TipoMovimentacao (String nome, int fatorMultiplicativo) {
    this.nome = nome;
    this.fatorMultiplicativo = fatorMultiplicativo;
}

public void setNome(String nome) {
    this.nome = nome;
}
public String getNome() {
    return this.nome;
}

public int getFatorMultiplicativo() {
    return this.fatorMultiplicativo;
}
    
}
