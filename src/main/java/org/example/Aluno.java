package org.example;

// Classe Aluno (Abstrata)
public abstract class Aluno {
    protected String nome;
    protected Plano plano;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void assinarPlano(Plano plano) {
        this.plano = plano;
        System.out.println(nome + " assinou o plano: " + plano.getClass().getSimpleName());
    }

    public void renovarPlano() {
        System.out.println(nome + " renovou o plano por mais " + plano.getDuracaoDias() + " dias.");
    }

    public abstract double calcularPrecoFinal();
}
