package com.unicesumar;

import com.unicesumar.entities.User;
import com.unicesumar.repository.UserRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:users.db";
        try (Connection connection = DriverManager.getConnection(url)) {
            connection.createStatement().execute("PRAGMA foreign_keys = ON;");

            UserRepository userRepository = new UserRepository(connection);

            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("1. Cadastrar Usuário");
                System.out.println("2. Listar Usuários");
                System.out.println("3. Excluir Usuário");
                System.out.println("4. Sair");
                System.out.print("Escolha uma opção: ");
                int option = scanner.nextInt();
                scanner.nextLine();

                switch (option) {
                    case 1:
                        System.out.print("Digite o nome: ");
                        String name = scanner.nextLine();
                        System.out.print("Digite o e-mail: ");
                        String email = scanner.nextLine();
                        System.out.print("Digite a senha: ");
                        String password = scanner.nextLine();
                        UUID uuid = UUID.randomUUID();
                        User newUser = new User(uuid, name, email, password);
                        userRepository.save(newUser);
                        System.out.println("Usuário cadastrado com sucesso!");
                        break;

                    case 2:
                        List<User> users = userRepository.findAll();
                        users.forEach(user -> System.out.println("ID: " + user.getUuid() + ", Nome: " + user.getName()));
                        break;

                    case 3:
                        System.out.print("Digite o ID do usuário a ser excluído: ");
                        String idToDelete = scanner.nextLine();
                        userRepository.deleteById(UUID.fromString(idToDelete));
                        System.out.println("Usuário excluído com sucesso!");
                        break;

                    case 4:
                        System.out.println("Saindo...");
                        return;

                    default:
                        System.out.println("Opção inválida.");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
