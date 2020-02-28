package com.company;

public class Diretor extends Funcionario implements Autenticacao{

    private int nivelHierarquiaEmpresa;
    private String regiao;

    public Diretor(String nome, int idade, String cpf, double salario, String cargo, int nivelHierarquiaEmpresa, String regiao) {
        super(nome, idade, cpf, salario, cargo);
        this.nivelHierarquiaEmpresa = nivelHierarquiaEmpresa;
        this.regiao = regiao;
    }

    @Override
    public double bonusFuncionario() {
        return super.bonusFuncionario() + getSalario() * 2;
    }

    public double bonusFuncionario(int multiplicadorBonus) {
        return bonusFuncionario() * multiplicadorBonus;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nNivel de Hierarquia: " + nivelHierarquiaEmpresa +
                "\nRegiao: " + regiao;
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
