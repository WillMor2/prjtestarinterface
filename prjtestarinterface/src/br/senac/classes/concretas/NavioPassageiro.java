package br.senac.classes.concretas;

import br.senac.rj.interfaces.Passageiro;
import br.senac.superclasse.Navio;


public class NavioPassageiro extends Navio implements Passageiro{

    private int passageirosPresentes;
    
    public NavioPassageiro() {
    super();
}


    public NavioPassageiro(String nome, int capacidade) {
    super(nome, capacidade);
}

// Sobrescrevendo métodos da superclasse
    @Override
    public void partir() {
    System.out.println("Navio de passageiros '" + getNome() + "' está partindo com " + passageirosPresentes + " passageiros.");
}


    @Override
    public void atracar() {
    System.out.println("Navio de passageiros '" + getNome() + "' está atracando.");
}


    @Override
    public void navegar() {
    System.out.println("Navio de passageiros '" + getNome() + "' navegando." );
}


    @Override
    public void parar() {
    System.out.println("Navio de passageiros '" + getNome() + "' parou.");
}


// Implementação da interface Passageiro
    @Override
    public void embarcar(int quantidade) {
    passageirosPresentes += quantidade;
    System.out.println(quantidade + " passageiro(s) embarcaram. Total a bordo: " + passageirosPresentes);
}


    @Override
    public void desembarcar(int quantidade) {
    passageirosPresentes -= quantidade;
    if (passageirosPresentes < 0) passageirosPresentes = 0;
    System.out.println(quantidade + " passageiro(s) desembarcaram. Total a bordo: " + passageirosPresentes);
}
}
