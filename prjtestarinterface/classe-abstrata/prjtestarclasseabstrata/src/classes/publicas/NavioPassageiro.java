/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.publicas;

import classes.abstratas.Navio;


public class NavioPassageiro extends Navio {

    private int capacidadePassageiros;        // número máximo de passageiros
    private int passageirosEmbarcados;       // total atual embarcado

    // 1) Construtor sem parâmetros -> chama super() sem params
    public NavioPassageiro() {
        super();
        this.capacidadePassageiros = 0;
        this.passageirosEmbarcados = 0;
    }

    // 2) Construtor que informa somente a capacidade -> chama super() sem params
    public NavioPassageiro(int capacidadePassageiros) {
        super();
        this.capacidadePassageiros = capacidadePassageiros;
        this.passageirosEmbarcados = 0;
    }

    // 3) Construtor que informa nome, peso, comprimento e capacidade -> chama super(nome,peso,comprimento)
    public NavioPassageiro(String nome, long peso, int comprimento, int capacidadePassageiros) {
        super(nome, peso, comprimento);
        this.capacidadePassageiros = capacidadePassageiros;
        this.passageirosEmbarcados = 0;
    }

    // Método para embarcar passageiros, com verificação de capacidade
    public void embarcarPassageiros(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida para embarque.");
            return;
        }

        if (passageirosEmbarcados + quantidade < capacidadePassageiros) {
            passageirosEmbarcados += quantidade;
            System.out.println(quantidade + " passageiros embarcaram.");
        } else if (passageirosEmbarcados + quantidade == capacidadePassageiros) {
            passageirosEmbarcados += quantidade;
            System.out.println(quantidade + " passageiros embarcaram. 🚩 O navio alcançou sua capacidade máxima (" + capacidadePassageiros + ").");
        } else {
            System.out.println("❌ Capacidade máxima excedida! Não é possível embarcar " + quantidade + " passageiros.");
        }
    }

    // Método para desembarcar um número de passageiros
    public void desembarcarPassageiros(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida para desembarque.");
            return;
        }

        if (quantidade < passageirosEmbarcados) {
            passageirosEmbarcados -= quantidade;
            System.out.println(quantidade + " passageiros desembarcaram.");
        } else if (quantidade == passageirosEmbarcados) {
            passageirosEmbarcados = 0;
            System.out.println("Todos os passageiros desembarcaram. Agora não há passageiros a bordo.");
        } else {
            System.out.println("❌ Não há tantos passageiros embarcados para desembarcar (" + quantidade + ").");
        }
    }

    // Desembarcar todos os passageiros
    public void desembarcarTodosOsPassageiros() {
        if (passageirosEmbarcados > 0) {
            System.out.println("Desembarcando todos os " + passageirosEmbarcados + " passageiros...");
            passageirosEmbarcados = 0;
        } else {
            System.out.println("Não há passageiros a bordo para desembarcar.");
        }
    }

    // Mostrar quantidade embarcada
    public void apresentarQuantidadePassageirosEmbarcados() {
        System.out.println("Passageiros embarcados: " + passageirosEmbarcados + " / " + capacidadePassageiros);
    }

    // Implementações dos métodos abstratos da superclasse Navio
    @Override
    public void partir() {
        System.out.println("O navio de passageiros " + getNome() + " está partindo do porto.");
    }

    @Override
    public void navegar() {
        System.out.println("O navio de passageiros " + getNome() + " está navegando com " + passageirosEmbarcados + " passageiros a bordo.");
    }

    @Override
    public void parar() {
        System.out.println("O navio de passageiros " + getNome() + " parou no local de atracação.");
    }

    @Override
    public void atracar() {
        System.out.println("O navio de passageiros " + getNome() + " está atracando no porto.");
    }
}
