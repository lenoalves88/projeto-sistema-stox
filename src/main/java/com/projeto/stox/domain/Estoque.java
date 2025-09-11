package com.projeto.stox.domain;

public class Estoque {
    private int id;
    private double quantidadeEmEstoque;
    private double quantidadeVendido;
    private double quantidadeVencida;
    private double quantidadeSeparada;
    private double quantidadeDeSaida;
    
public Estoque(double quantidadeEmEstoque, double quantidadeVendido, double quantidadeVencida, double quantidadeSeparada, double quantidadeDeSaida) {
    this.quantidadeEmEstoque = quantidadeEmEstoque;
    this.quantidadeVendido = quantidadeVendido;
    this.quantidadeVencida = quantidadeVencida;
    this.quantidadeSeparada = quantidadeSeparada;
    this.quantidadeDeSaida = quantidadeDeSaida;
}

public void setquantidadeEmEstoque(double quantidadeEmEstoque){
    this.quantidadeEmEstoque = quantidadeEmEstoque;
}
public double getquantidadeEmEstoque() {
    return this.quantidadeEmEstoque;
}

public void setquantidadeVendido(double quantidadeVendido) {
    this.quantidadeVendido = quantidadeVendido;
}
public double getquantidadeVendido() {
    return this.quantidadeVendido;
}

public void setquantidadeVencida(double quantidadeVencida) {
    this.quantidadeVencida = quantidadeVencida;
}
public double getquantidadeVencida(double quantidadeVencida) {
    return this.quantidadeVencida;
}

public void setquantidadeSeparada(double quantidadeSeparada) {
    this.quantidadeSeparada = quantidadeSeparada;
}
public double getquantidadeSeparada(double quantidadeSeparada) {
    return this.quantidadeSeparada;
}
    
public void setquantidadeDeSaida(double quantidadeDeSaida) {
    this.quantidadeDeSaida = quantidadeDeSaida;
}
public double getquantidadeDeSaida(double quantidadeDeSaida){
    return this.quantidadeDeSaida;
}

}

