package Locadora;


public class Carro extends Veiculo{

    public Carro(String placa, String modelo, double valorDiaria) {
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
        double valor = getValorDiaria() * dias + (dias * 10);
        return valor;
    }
}