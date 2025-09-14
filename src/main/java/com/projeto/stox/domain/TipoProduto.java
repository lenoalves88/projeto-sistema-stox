package com.projeto.stox.domain;

public class TipoProduto {

    private int id;
    private String nome;

public TipoProduto(String nome) {
    this.nome = nome;
}

public void setNome(String nome) {
    this.nome = nome;
}
public String getNome() {
    return this.nome;
}

}
