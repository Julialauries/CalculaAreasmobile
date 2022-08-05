package com.example.ex_1;

/* Uma classe para representar um círculo. Seu construtor deve receber o
tamanho do raio; */

public class Circulo implements FormaMensuravel {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public double getRaio() {
        return raio;
    }
}
