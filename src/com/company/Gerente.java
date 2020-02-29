package com.company;

public class Gerente extends Funcionario implements Autenticacao{

    private int nivelHierarquiaEmpresa;
    private String agencia;

    public Gerente(String nome, int idade, String cpf, double salario, String cargo, int nivelHierarquiaEmpresa, String agencia) {
        super(nome, idade, cpf, salario, cargo);
        this.nivelHierarquiaEmpresa = nivelHierarquiaEmpresa;
        this.agencia = agencia;
    }

    @Override
    public double bonusFuncionario() {
        return super.bonusFuncionario() + getSalario();
    }

    public double bonusFuncionario(int multiplicadorBonus) {
        return bonusFuncionario() * multiplicadorBonus;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nNivel de Hierarquia: " + nivelHierarquiaEmpresa +
                "\nAgencia: " + agencia;
    }

    @Override
    public void autenticacao() {
        if(getSenha() == 222) {
            System.out.println("LOgado");
        } else {
            System.out.println("Senha incorreta!");
        }
    }
}
