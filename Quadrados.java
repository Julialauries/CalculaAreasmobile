package com.example.ex_1;

/* Classes para representar retângulos e quadrados. A primeira deve
receber o tamanho da base e da altura no construtor, enquanto a
segunda deve receber apenas o tamanho do lado; */



public class Quadrados extends Quadrilateros {
    public Quadrados(double lado) {
        super(lado, lado, lado, lado);
    }

    @Override
    public double calculoArea() {
        return lados[0] * lados[0];
    }

    public double getLado() {
        return lados[0];
    }
}
