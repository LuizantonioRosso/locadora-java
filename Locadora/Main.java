package Locadora;
import java.util.Scanner;

   public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Frota frota = new Frota();

        System.out.println("Bem-vindo ao Sistema de Locadora");

        int opcaoMenu;

        do {

        System.out.println("1 - Cadastrar Veículo");
        System.out.println("2 - Alugar veículo");
        System.out.println("3 - Devolver veículo");
        System.out.println("4 - Listar veículos"); 
        System.out.println("5 - Sair ");   
        opcaoMenu = scanner.nextInt();
        scanner.nextLine();
    
        switch (opcaoMenu) {
            case 1:

            int opcao;

        do {
          
        System.out.println("Digite uma opção!");
        System.out.println("1 - Carro ");
        System.out.println("2 - Moto ");
        System.out.println("3 - Van ");
        System.out.println("4 - sair");
       
        opcao = scanner.nextInt();
        scanner.nextLine();
        
            switch (opcao) {
                case 1: {
                       
                System.out.println("Digite a Placa:");
                String placa = scanner.nextLine();

                System.out.println("Digite o Modelo:");
                String modelo = scanner.nextLine();

                System.out.println("Digite O Valor da Díaria:");
                double valorDiaria = scanner.nextDouble();

                Carro carro = new Carro(placa, modelo, valorDiaria);
                frota.cadastrar(carro);
                  
                break; 
            }
                case 2: {
                
                System.out.println("Digite a Placa:");
                String placa = scanner.nextLine();

                System.out.println("Digite o Modelo:");
                String modelo = scanner.nextLine();

                System.out.println("Digite O Valor da Díaria:");
                double valorDiaria = scanner.nextDouble();

                Moto moto = new Moto(placa, modelo, valorDiaria);
                frota.cadastrar(moto);

                break;
                }
                case 3: {
                
                System.out.println("Digite a Placa:");
                String placa = scanner.nextLine();

                System.out.println("Digite o Modelo:");
                String modelo = scanner.nextLine();

                System.out.println("Digite O Valor da Díaria:");
                double valorDiaria = scanner.nextDouble();

                Van van = new Van(placa, modelo, valorDiaria);
                frota.cadastrar(van);

                break;
                }
                case 4:

                System.out.println("Saindoo !!!");
                     break;
            
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
           
        }  while (opcao != 4);
                break;
            case 2: {
    
            System.out.println("Digite a Placa pra Alugar:");
            String placa = scanner.nextLine();
            frota.alugar(placa);

            break; }
            case 3: {
                System.out.println("Digite a Placa pra alugar");
                String placa = scanner.nextLine();
                frota.devolver(placa);
            }
            break;

            case 4: {
             System.out.println("Quantos dias?");
             int dias = scanner.nextInt();
             frota.listarComValores(dias)

            break;
            }
            case 5:

            break;

            default:
                System.out.println("Saindo !!!!");
                break;
        }

        } while (opcaoMenu != 5);

    }
}