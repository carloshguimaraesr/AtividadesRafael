package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Produto> listaDeProdutos = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Buscar produto por código");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Opção de cadastro selecionada.");
                    System.out.print("Digite o código do produto: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o preço do produto: ");
                    double preco = scanner.nextDouble();
                    scanner.nextLine();

                    Produto produto = new Produto(codigo, nome, preco);
                    listaDeProdutos.put(codigo, produto);

                    System.out.println("Produto cadastrado com sucesso.");
                    break;

                case 2:
                    System.out.println("Opção de busca selecionada.");

                    System.out.print("Digite o código do produto a ser buscado: ");
                    int codigoBusca = scanner.nextInt();
                    scanner.nextLine();

                    Produto produtoBuscado = listaDeProdutos.get(codigoBusca);
                    if (produtoBuscado != null) {
                        produtoBuscado.exibirInformacoes();
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);

        scanner.close();
    }
}
