package org.example;

class ContaInvestimento extends ContaBancaria {
    public ContaInvestimento(String numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public boolean sacar(double valor) {
        double taxa = valor * 0.02;
        double totalSaque = valor + taxa;
        if (saldo >= totalSaque) {
            saldo -= totalSaque;
            System.out.println("Saque de R$" + valor + " realizado com taxa de R$" + taxa);
            return true;
        }
        System.out.println("Saldo insuficiente para saque.");
        return false;
    }
}

