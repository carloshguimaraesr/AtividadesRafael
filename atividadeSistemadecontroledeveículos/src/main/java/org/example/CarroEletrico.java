package org.example;

class CarroEletrico extends Carro {
    private double bateriaKWh;
    private static final double CONSUMO = 5.0;

    public CarroEletrico(String marca, String modelo, int ano, int capacidadePassageiros, String tipoCarro, double bateriaKWh) {
        super(marca, modelo, ano, capacidadePassageiros, tipoCarro);
        this.bateriaKWh = bateriaKWh;
    }

    @Override
    public double calcularAutonomia() {
        return bateriaKWh * CONSUMO;
    }
}

