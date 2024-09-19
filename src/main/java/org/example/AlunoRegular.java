package org.example;

// Aluno Regular
public class AlunoRegular extends Aluno {
    public AlunoRegular(String nome) {
        super(nome);
    }

    @Override
    public double calcularPrecoFinal() {
        return plano.calcularPreco();
    }
}
