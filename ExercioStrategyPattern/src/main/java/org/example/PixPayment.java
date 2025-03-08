package org.example;

import java.util.Random;

public class PixPayment implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        Random random = new Random();
        String pixCode = "PIX-" + random.nextInt(1000000);
        System.out.println("Pagamento via Pix processado com sucesso!");
        System.out.println("Código do Pix: " + pixCode);
        System.out.println("Valor: R$ " + amount);
    }
}
