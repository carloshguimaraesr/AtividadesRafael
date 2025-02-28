package org.example;

class ContaInvestimentoAltoRisco extends ContaInvestimento {
    public ContaInvestimentoAltoRisco(String numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public boolean sacar(double valor) {
        double taxa = valor * 0.05;
        double totalSaque = valor + taxa;
        if (saldo >= totalSaque && saldo - totalSaque >= 10000) {
            saldo -= totalSaque;
            System.out.println("Saque de R$" + valor + " realizado com taxa de R$" + taxa);
            return true;
        }
        System.out.println("Saldo insuficiente ou abaixo do mínimo permitido.");
        return false;
    }
}
