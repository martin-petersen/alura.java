package com.company.model;

public class ControleBonificacao {

    private double totalBonificacao;

    public double getTotalBonificacao() {
        return totalBonificacao;
    }

    public void somadorBonificacao(Funcionario f) {
        this.totalBonificacao += f.bonusFuncionario();
    }
}
