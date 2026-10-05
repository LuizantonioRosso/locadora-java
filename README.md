Locadora de Veículos em Java

Sistema de gerenciamento de locadora de veículos desenvolvido em Java, aplicando conceitos de Programação Orientada a Objetos como herança, polimorfismo, encapsulamento e composição.

📋 Funcionalidades
Cadastro de veículos de diferentes tipos (Carro, Moto, Van)
Controle de status de cada veículo (disponível, alugado, manutenção)
Aluguel e devolução de veículos, com validação de status antes de alugar
Cálculo do valor da diária, com regras diferentes por tipo de veículo
Listagem da frota com os valores calculados
Menu interativo via console
🏗️ Estrutura do projeto
Classe	Responsabilidade
Veiculo	Classe abstrata base, com atributos comuns e cálculo de aluguel abstrato
Carro, Moto, Van	Subclasses concretas, cada uma com sua própria regra de cálculo de aluguel
StatusVeiculo	Enum com os status possíveis, com comportamento próprio por constante
Frota	Gerencia a coleção de veículos (cadastrar, buscar, alugar, devolver, listar)
🧠 Conceitos de POO aplicados
Herança — Veiculo como superclasse abstrata de Carro, Moto e Van
Polimorfismo — calcularAluguel() se comporta de forma diferente em cada subclasse
Encapsulamento — atributos privados com acesso via getters/setters
Composição — Frota é composta por uma coleção de Veiculo
Enum com comportamento — StatusVeiculo implementa podeAlugar() de forma própria em cada constante
▶️ Como executar
Clone o repositório
Compile as classes dentro do pacote Locadora
Execute a classe Main
bash
javac Locadora/*.java
java Locadora.Main
👤 Autor

Desenvolvido por Luiz Rosso, estudante de Sistema de Informação, como projeto de estudo em Java e POO.
