package com.company.model;

import java.time.LocalDateTime;

public abstract class Funcionario extends Pessoa{

    private double salario;
    private String cargo;
    private LocalDateTime dataAdmissao;


    public Funcionario(String nome, int idade, String cpf, double salario, String cargo) {
        super(nome, idade, cpf);
        this.salario = salario;
        this.cargo = cargo;
        this.dataAdmissao = LocalDateTime.now();
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public LocalDateTime getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDateTime dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double bonusFuncionario() {
        return getSalario() * 0.1;
    }

    @Override
    public String toString() {
        return "Funcionario: " +
                super.toString() +
                "\nCargo: " + cargo +
                "\nSalario: " + salario +
                "\nDataAdmissao: " + dataAdmissao;
    }
}
