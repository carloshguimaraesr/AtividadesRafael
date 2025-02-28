package org.example;

class Caminhao extends Veiculo {
    private double capacidadeCarga;
    private static final double CONSUMO = 6.0;
    private static final int TANQUE = 300;

    public Caminhao(String marca, String modelo, int ano, int capacidadePassageiros, double capacidadeCarga) {
        super(marca, modelo, ano, capacidadePassageiros, "Diesel");
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public double calcularAutonomia() {
        double reducao = Math.min(0.01 * capacidadeCarga, 0.25);
        return TANQUE * (CONSUMO * (1 - reducao));
    }
}
