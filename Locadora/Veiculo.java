package Locadora;


public abstract class Veiculo {
    private StatusVeiculo status;
    private String placa;
    private String modelo;
    private double valorDiaria;

    public Veiculo(String placa, String modelo, double valorDiaria) {
        this.placa = placa;
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
        this.status =StatusVeiculo.DISPONIVEL;
    }
    
    public abstract double calcularAluguel(int dias);
    

    public abstract String descricao();

    public String getPlaca() {
        return placa;
    } 
    
    public String getModelo() {
        return modelo;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public StatusVeiculo getStatus() {
        return status;
    }

    public void setStatus(StatusVeiculo status) {
        this.status = status;
    }
    
}