package org.example;

class Onibus extends Veiculo {
    private int quantidadeEixos;
    private static final double CONSUMO = 5.0;
    private static final int TANQUE = 200;

    public Onibus(String marca, String modelo, int ano, int capacidadePassageiros, int quantidadeEixos) {
        super(marca, modelo, ano, capacidadePassageiros, "Diesel");
        if (quantidadeEixos < 6 || quantidadeEixos > 8) {
            throw new IllegalArgumentException("Ônibus deve ter entre 6 e 8 eixos.");
        }
        this.quantidadeEixos = quantidadeEixos;
    }

    @Override
    public double calcularAutonomia() {
        return TANQUE * CONSUMO;
    }
}
