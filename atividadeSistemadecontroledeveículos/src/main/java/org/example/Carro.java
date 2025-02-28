package org.example;

class Carro extends Veiculo {
    private String tipoCarro;
    private static final double CONSUMO = 12.0;
    private static final int TANQUE = 50;

    public Carro(String marca, String modelo, int ano, int capacidadePassageiros, String tipoCarro) {
        super(marca, modelo, ano, capacidadePassageiros, "Gasolina");
        this.tipoCarro = tipoCarro;
    }

    @Override
    public double calcularAutonomia() {
        return TANQUE * CONSUMO;
    }
}
