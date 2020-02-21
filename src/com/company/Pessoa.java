package com.company;

public class Pessoa {
    private String nome;
    private int idade;
    private String ocupacao;
    private String cpf;

    public Pessoa(String nome, int idade, String ocupacao, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.ocupacao = ocupacao;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome +
                "\nIdade: " + idade +
                "\nOcupacao: " + ocupacao +
                "\nCPF: " + cpf;
    }
}
