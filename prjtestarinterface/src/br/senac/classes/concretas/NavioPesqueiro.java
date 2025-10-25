package br.senac.classes.concretas;

import br.senac.classes.tipoPesca.TipoPesca;
import br.senac.superclasse.Navio;
import br.senac.rj.interfaces.Pesqueiro;

public class NavioPesqueiro extends Navio implements Pesqueiro {
    private boolean pescando = false;
    private TipoPesca tipoAtual;


    public NavioPesqueiro() {
        super();
}


    public NavioPesqueiro(String nome, int capacidade) {
        super(nome, capacidade);
}


// Sobrescrevendo métodos da superclasse
    @Override
    public void partir() {
    System.out.println("Navio pesqueiro '" + getNome() + "' está partindo para a pesca.");
}


    @Override
    public void atracar() {
    System.out.println("Navio pesqueiro '" + getNome() + "' atracou no porto.");
}


    @Override
    public void navegar() {
    System.out.println("Navio pesqueiro '" + getNome() + "' navegando em busca de cardumes.");
}


    @Override
    public void parar() {
    System.out.println("Navio pesqueiro '" + getNome() + "' parou as máquinas.");
}


// Implementação da interface Pesqueiro
    @Override
    public void iniciarPesca(TipoPesca tipo) {
    pescando = true;
    tipoAtual = tipo;
    System.out.println("Iniciando pesca do tipo: " + tipo);
}


    @Override
    public void encerrarPesca() {
    pescando = false;
    System.out.println("Encerrando pesca. Último tipo: " + tipoAtual);
        
    tipoAtual = null;
}
}