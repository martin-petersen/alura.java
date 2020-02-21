package com.company;

import java.math.BigDecimal;

public class Conta {
    private Pessoa titular;
    private String agencia;
    private String numero;
    private double saldo;

    public Conta() {
    }

    public Conta(Pessoa titular, String agencia, String numero) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }

    public Conta(Pessoa titular, String agencia, String numero, double saldo) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
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

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
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
            this.saque(valor);
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
}
