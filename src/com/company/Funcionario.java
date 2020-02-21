package com.company;

import java.time.LocalDateTime;

public class Funcionario extends Pessoa{

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

    @Override
    public String toString() {
        return "Funcionario: " +
                super.toString() +
                "\nSalario: " + salario +
                "\nCargo: " + cargo+
                "\nDataAdmissao: " + dataAdmissao;
    }
}
