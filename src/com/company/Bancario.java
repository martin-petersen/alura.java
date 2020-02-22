package com.company;

public class Bancario extends Funcionario{

    private int guiche;
    private String agencia;

    public Bancario(String nome, int idade, String cpf, double salario, String cargo, int guiche, String agencia) {
        super(nome, idade, cpf, salario, cargo);
        this.guiche = guiche;
        this.agencia = agencia;
    }

    @Override
    public double bonusFuncionario() {
        return super.bonusFuncionario();
    }

    public double bonusFuncionario(int multiplicadorBonus) {
        return bonusFuncionario() * multiplicadorBonus;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nGuiche: " + guiche +
                "\nAgencia: " + agencia;
    }
}
