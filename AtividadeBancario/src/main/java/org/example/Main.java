package org.example;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("1234", "Carlos", 1000, 500);
        ContaPoupanca cp = new ContaPoupanca("5678", "Ana", 1500);
        ContaInvestimento ci = new ContaInvestimento("91011", "João", 5000);
        ContaSalario cs = new ContaSalario("1213", "Mariana", 2000, 300);
        ContaInvestimentoAltoRisco ciar = new ContaInvestimentoAltoRisco("1415", "Ricardo", 12000);

        cc.exibirInformacoes();
        cc.sacar(1300);
        cc.exibirInformacoes();

        cp.exibirInformacoes();
        cp.sacar(1600);
        cp.exibirInformacoes();

        ci.exibirInformacoes();
        ci.sacar(1000);
        ci.exibirInformacoes();

        cs.exibirInformacoes();
        cs.sacar(500);
        cs.sacar(500);
        cs.exibirInformacoes();

        ciar.exibirInformacoes();
        ciar.sacar(2000);
        ciar.exibirInformacoes();
    }
}
