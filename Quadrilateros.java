package com.example.ex_1;

/* Uma classe abstrata para representar quadriláteros. Seu construtor deve
receber os tamanhos dos 4 lados e o método de cálculo do perímetro já
pode ser implementado; */

public abstract class Quadrilateros implements FormaMensuravel {
    protected double[] lados;

    public Quadrilateros(double lado1, double lado2, double lado3, double lado4) {
        lados = new double[] {lado1, lado2, lado3, lado4};
    }

    @Override
    public double calculoPerimetro() {
        return lados[0] + lados[1] + lados[2]	+ lados[3];
    }
}
