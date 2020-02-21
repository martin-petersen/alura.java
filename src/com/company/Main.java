package com.company;

public class Main {

    public static void main(String[] args) {
        Conta conta1 = new Conta(new Pessoa("martin", 23, "estudante", "270.855.770-02"),"1245-6","895654-7",10000);
        Conta conta2 = new Conta(new Pessoa("delcio", 30, "testador", "056.184.670-70"),"1245-6","525654-7",10);

        conta1.transferencia(300,conta2);

        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());
        System.out.println(conta1.toString());

        System.out.println(Conta.getTotalContas());
    }
}
