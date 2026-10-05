package Locadora;
import java.util.ArrayList;

public class Frota {

    private ArrayList<Veiculo> veiculos;

    public Frota() {
     veiculos = new ArrayList<>();
    }

    public boolean cadastrar(Veiculo v) {
        for (Veiculo veiculo : veiculos ) {
            if (veiculo.getPlaca().equalsIgnoreCase(v.getPlaca())) {
                return false;
            }
        }
         veiculos.add(v);
    return true;
    }

    public Veiculo buscarPorPlaca(String placa) {
       for (Veiculo v : veiculos) {
             if (v.getPlaca().equalsIgnoreCase(placa)) {
                return v;
             }
       }
       return null;
    }

        public boolean alugar(String placa) {
     
        Veiculo veiculo = buscarPorPlaca(placa);
       
         if (veiculo == null) {
         return false;
         }

          if  (!veiculo.getStatus().podeAlugar()) {
            return false;
          }
          veiculo.setStatus(StatusVeiculo.ALUGADO);
          return true;
        }

        public boolean devolver(String placa) {
            
        Veiculo     veiculo = buscarPorPlaca(placa);

         if (veiculo == null) {
                return false;
         }
         veiculo.setStatus(StatusVeiculo.DISPONIVEL);
         return true;

        }

    public void listarComValores(int dias) {
        for (Veiculo v : veiculos) {
            System.out.print(v.descricao()); 

            System.out.println(v.calcularAluguel(dias));
            
        }
    }

    
}