package org.example;

class ContaSalario extends ContaCorrente {
    private int saquesGratis = 1;

    public ContaSalario(String numeroConta, String titular, double saldo, double limiteChequeEspecial) {
        super(numeroConta, titular, saldo, limiteChequeEspecial);
    }

    @Override
    public boolean sacar(double valor) {
        if (saquesGratis > 0) {
            saquesGratis--;
            return super.sacar(valor);
        } else {
            double total = valor + 5.0;
            if (saldo + limiteChequeEspecial >= total) {
                saldo -= total;
                System.out.println("Saque de R$" + valor + " realizado com taxa de R$5.00.");
                return true;
            }
            System.out.println("Saldo insuficiente.");
            return false;
        }
    }
}
