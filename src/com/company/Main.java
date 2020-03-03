package com.company;

import com.company.exception.AutenticacaoException;
import com.company.model.*;

public class Main {

    public static void main(String[] args) {
        Conta conta1 = new Conta(new Cliente("martin", 23, "estudante", "270.855.770-02"),"1245-6","895654-7",10000);
        Conta conta2 = new Conta(new Cliente("delcio", 30, "testador", "056.184.670-70"),"1245-6","525654-7",10);

        conta1.transferencia(300,conta2);

        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());
        System.out.println();

        System.out.println(conta1.toString());
        System.out.println(conta2.toString());
        System.out.println();

        System.out.println(Conta.getTotalContas());
        System.out.println();

        Bancario novoBancario = new Bancario("Maria Nercy", 22, "728.266.840-00", 2500, "bancaria", 3, "1668-7");
        Gerente novoGerente = new Gerente("Martin Petersen", 23, "004.236.460-44", 5000, "gerente", 3, "1856-0");
        Diretor novoDiretor = new Diretor("Lionel Richie", 70, "687.563.350-75", 30000, "diretor", 2, "sul");

        System.out.println(novoBancario.toString());
        System.out.println(novoBancario.getSalario() + novoBancario.bonusFuncionario());
        System.out.println();

        System.out.println(novoGerente.toString());
        System.out.println(novoGerente.getSalario() + novoGerente.bonusFuncionario());
        System.out.println();

        System.out.println(novoDiretor.toString());
        System.out.println(novoDiretor.getSalario() + novoDiretor.bonusFuncionario());

        novoGerente.setSenha(223);

        try{
            novoGerente.autenticacao();
        } catch (AutenticacaoException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
