package org.example;

// Plano Anual com 15% de desconto
public class PlanoAnual implements Plano {
    private double precoBase = 1000.0;
    private int duracaoDias = 365;

    @Override
    public double calcularPreco() {
        return precoBase * 0.85; // 15% de desconto
    }

    @Override
    public int getDuracaoDias() {
        return duracaoDias;
    }
}
