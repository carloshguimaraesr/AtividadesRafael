package org.example;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== MENU DE NOTIFICAÇÕES =====");
            System.out.println("1: E-mail");
            System.out.println("2: SMS");
            System.out.println("3: Notificação Push");
            System.out.println("0: Sair");
            System.out.print("Escolha uma opção: ");

            String escolha = scanner.nextLine();


            if (escolha.equals("0")) {
                System.out.println("Encerrando o programa...");
                break;
            }


            System.out.print("Digite a mensagem que deseja enviar: ");
            String mensagem = scanner.nextLine();

            try {

                Notificacao notificacao = FabricaNotificacoes.criarNotificacao(escolha);


                System.out.println("\n>>> Enviando Notificação...");
                notificacao.enviar(mensagem);


                Thread.sleep(2000);

                System.out.println("====================================");

            } catch (IllegalArgumentException e) {
                System.out.println("Opção inválida, tente novamente.");
            } catch (InterruptedException e) {
                System.out.println("Erro ao pausar a execução.");
            }
        }

        scanner.close();
    }
}
