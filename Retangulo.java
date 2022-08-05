package com.example.ex_1;

/* Classes para representar retângulos e quadrados. A primeira deve
receber o tamanho da base e da altura no construtor, enquanto a
segunda deve receber apenas o tamanho do lado; */


public class Retangulo extends Quadrilateros {
    public Retangulo(double base, double altura) {
        super(base, altura, base, altura);
    }

    @Override
    public double calculoArea() {
        return lados[0] * lados[1];
    }

    /** Retorna o tamanho da base. */
    public double getBase() {
        return lados[0];
    }

    /** Retorna o tamanho da altura. */
    public double getAltura() {
        return lados[1];
    }
}
