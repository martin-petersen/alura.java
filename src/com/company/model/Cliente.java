package com.company.model;

public class Cliente extends Pessoa implements Autenticacao{
    private String ocupacao;

    public Cliente(String nome, int idade, String cpf, String ocupacao) {
        super(nome, idade, cpf);
        this.ocupacao = ocupacao;
    }

    public String getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }

    @Override
    public String toString() {
        return "Cliente: " +
                super.toString() +
                "\nOcupacao: " + ocupacao;
    }

    @Override
    public String autenticacao() {
        if(getSenha() == 22209) {
            return "Logado";
        } else {
            return "Senha incorreta!";
        }
    }
}
