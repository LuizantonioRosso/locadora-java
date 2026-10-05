package Locadora;


public class Moto extends Veiculo {

    public Moto(String placa, String modelo, double valorDiaria) {
      super(placa, modelo, valorDiaria);
    }
    
    @Override 
    public String descricao() {
      return 
        "Placa: " + getPlaca() +
        ", Modelo: " + getModelo();
    }

    @Override 
    public double calcularAluguel(int dias) {
      return getValorDiaria() * dias;
    }
}