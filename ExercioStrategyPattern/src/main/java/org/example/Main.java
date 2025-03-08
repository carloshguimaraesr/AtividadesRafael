package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o método de pagamento:");
        System.out.println("1: Pix");
        System.out.println("2: Cartão de Crédito");
        System.out.println("3: Boleto");
        System.out.print("Digite o número da opção: ");
        int option = scanner.nextInt();

        System.out.print("Digite o valor da transação (R$): ");
        double amount = scanner.nextDouble();

        PaymentStrategy paymentStrategy = null;

        switch (option) {
            case 1:
                paymentStrategy = new PixPayment();
                break;
            case 2:
                paymentStrategy = new CreditCardaPayment();
                break;
            case 3:
                paymentStrategy = new BoletoPayment();
                break;
            default:
                System.out.println("Opção inválida.");
                System.exit(0);
        }

        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentStrategy);
        paymentProcessor.executePayment(amount);
    }
}
