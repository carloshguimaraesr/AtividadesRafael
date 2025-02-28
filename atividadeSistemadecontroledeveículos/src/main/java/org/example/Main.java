package org.example;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2022, 5, "Sedan");
        Caminhao caminhao = new Caminhao("Volvo", "FH", 2021, 2, 10);
        Onibus onibus = new Onibus("Mercedes", "Benz O500", 2020, 40, 6);
        CarroEletrico carroEletrico = new CarroEletrico("Tesla", "Model S", 2023, 5, "Sedan", 100);
        CaminhaoRefrigerado caminhaoRefrigerado = new CaminhaoRefrigerado("Scania", "P320", 2022, 2, 8, -18);

        Veiculo[] veiculos = {carro, caminhao, onibus, carroEletrico, caminhaoRefrigerado};
        for (Veiculo v : veiculos) {
            v.exibirDetalhes();
            System.out.println("Autonomia: " + v.calcularAutonomia() + " km");
            System.out.println("------------------------------------");
        }
    }
}