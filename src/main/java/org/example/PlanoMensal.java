package org.example;

public class PlanoMensal implements Plano {
    private double precoBase = 100.0;
    private int duracaoDias = 30;

    @Override
    public double calcularPreco() {
        return precoBase;
    }

    @Override
    public int getDuracaoDias() {
        return duracaoDias;
    }
}
