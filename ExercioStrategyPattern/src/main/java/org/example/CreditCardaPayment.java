package org.example;

import java.util.Scanner;

public class CreditCardaPayment implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número do cartão de crédito (fictício): ");
        String cardNumber = scanner.nextLine();
        System.out.println("Pagamento via Cartão de Crédito processado com sucesso!");
        System.out.println("Número do Cartão: " + cardNumber);
        System.out.println("Valor: R$ " + amount);
    }
}
