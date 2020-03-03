package com.company.model;

public class Conta {
    private Pessoa titular;
    private String agencia;
    private String numero;
    private double saldo;
    //Atributo estatico comum a todas as contas, nao e criado sempre que um novo objeto Conta e criado
    //Mas e incrementado sempre que uma nova conta e aberta
    private static int totalContas;

    public Conta() {
        totalContas++;
    }

    public Conta(Pessoa titular, String agencia, String numero) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
        totalContas++;
    }

    public Conta(Pessoa titular, String agencia, String numero, double saldo) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        totalContas++;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        setSaldo(valor);
    }

    public boolean saque(double valor) {
        if(valor <= getSaldo()) {
            setSaldo(getSaldo()-valor);
            return true;
        }
        return false;
    }

    public boolean transferencia(double valor, Conta alvoTranferencia) {
        if(valor <= getSaldo()) {
            alvoTranferencia.depositar(valor);
            saque(valor);
            return true;
        } else {
            if(alvoTranferencia == this) {
                System.out.println("Você não pode transferir da sua conta para sua conta, WTF?");
                return false;
            }
            System.out.println("Saldo insuficiente");
            return false;
        }
    }

    public static int getTotalContas() {
        return totalContas;
    }

    @Override
    public String toString() {
        return "Conta: " +
                "\nTitular: " + titular.toString() +
                "\nAgencia: " + agencia +
                "\nNumero: " + numero +
                "\nSaldo: " + saldo;
    }
}
