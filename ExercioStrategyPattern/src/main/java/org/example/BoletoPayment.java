package org.example;

import java.util.Random;

public class BoletoPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount){
        Random random = new Random();
        String boletoCode = "BOLETO-" + random.nextInt(1000000);
        System.out.println("Pagamento via Boleto processado com sucesso!");
        System.out.println("Código do Boleto: " + boletoCode);
        System.out.println("Valor: R$ " + amount);
    }
}
