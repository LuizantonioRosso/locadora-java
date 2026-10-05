package Locadora;

public enum StatusVeiculo {
   DISPONIVEL { public boolean podeAlugar() { return true; } },
   ALUGADO { public boolean podeAlugar() { return false; } },
   MANUTENCAO { public boolean podeAlugar() { return false; } };
   
    public abstract boolean podeAlugar();
}