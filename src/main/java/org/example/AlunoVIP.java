package org.example;

// Aluno VIP com 10% de desconto adicional
public class AlunoVIP extends Aluno {
    public AlunoVIP(String nome) {
        super(nome);
    }

    @Override
    public double calcularPrecoFinal() {
        return plano.calcularPreco() * 0.90; // 10% de desconto adicional
    }
}
