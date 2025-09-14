package com.projeto.stox.domain;

import java.util.Date;

public class Fornecedor {

    private int id;
    private String nome;
    private String endereco;
    private Date ultimaCompra;
    private Date proximaCompra;

 
public Fornecedor(String nome, String endereco, Date ultimaCompra, Date proximaCompra) {
    this.nome = nome;
    this.endereco = endereco;
    this.ultimaCompra = ultimaCompra;
    this.proximaCompra = proximaCompra;
}

public void setNome(String nome) {
    this.nome = nome;
}
public String getNome() {
    return this.nome;
}

public void setEndereco(String endereco) {
    this.endereco = endereco;
}
public String getEndereco() {
    return this.endereco;
}

public void setUltimaCompra(Date ultimaCompra) {
    this.ultimaCompra = ultimaCompra;
}
public Date getUltimaCompra() {
    return this.ultimaCompra;
}

public void setProximaCompra(Date proximaCompra) {
    this.proximaCompra = proximaCompra;
}
public Date getProximaCompra() {
    return this.proximaCompra;
}

}
