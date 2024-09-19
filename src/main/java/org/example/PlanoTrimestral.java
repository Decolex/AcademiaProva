package org.example;

// Plano Trimestral com 5% de desconto
public class PlanoTrimestral implements Plano {
    private double precoBase = 270.0;
    private int duracaoDias = 90;

    @Override
    public double calcularPreco() {
        return precoBase * 0.95; // 5% de desconto
    }

    @Override
    public int getDuracaoDias() {
        return duracaoDias;
    }
}
