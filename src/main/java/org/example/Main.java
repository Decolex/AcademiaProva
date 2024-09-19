package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Criando alunos
        Aluno aluno1 = new AlunoRegular("João");
        Aluno aluno2 = new AlunoVIP("Maria");

        // Assinando planos
        Plano planoMensal = new PlanoMensal();
        Plano planoAnual = new PlanoAnual();

        aluno1.assinarPlano(planoMensal);
        aluno2.assinarPlano(planoAnual);

        // Exibindo preços finais
        System.out.println(aluno1.nome + " pagará: R$ " + aluno1.calcularPrecoFinal());
        System.out.println(aluno2.nome + " pagará: R$ " + aluno2.calcularPrecoFinal());

        // Renovando planos
        aluno1.renovarPlano();
        aluno2.renovarPlano();
    }
}