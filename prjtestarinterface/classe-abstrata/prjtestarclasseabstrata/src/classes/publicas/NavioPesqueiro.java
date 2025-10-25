/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.publicas;

import classes.abstratas.Navio;

/**
 *
 * @author morei
 */
public class NavioPesqueiro extends Navio {

    private int capacidadeCarga;       // capacidade total em kg (ou unidade)
    private int cargaAtual;            // carga atual armazenada
    private TipoPesca tipoPesca;       // tipo de pescado

    // 1) Construtor sem parâmetros
    public NavioPesqueiro() {
        super();
        this.capacidadeCarga = 0;
        this.cargaAtual = 0;
        this.tipoPesca = null;
    }

    // 2) Construtor que informa apenas capacidade e tipo (chama super() sem params)
    public NavioPesqueiro(int capacidadeCarga, TipoPesca tipoPesca) {
        super();
        this.capacidadeCarga = capacidadeCarga;
        this.cargaAtual = 0;
        this.tipoPesca = tipoPesca;
    }

    // 3) Construtor que informa nome, peso, comprimento, capacidade e tipo -> chama super(nome,peso,comprimento)
    public NavioPesqueiro(String nome, long peso, int comprimento, int capacidadeCarga, TipoPesca tipoPesca) {
        super(nome, peso, comprimento);
        this.capacidadeCarga = capacidadeCarga;
        this.cargaAtual = 0;
        this.tipoPesca = tipoPesca;
    }

    // Pescar: acrescenta quantidade se houver capacidade
    public void pescar(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida para pesca.");
            return;
        }

        if (cargaAtual + quantidade < capacidadeCarga) {
            cargaAtual += quantidade;
            System.out.println("Foram pescados " + quantidade + " unidades de " + tipoPesca + ". Carga atual: " + cargaAtual + "/" + capacidadeCarga);
        } else if (cargaAtual + quantidade == capacidadeCarga) {
            cargaAtual += quantidade;
            System.out.println("Foram pescados " + quantidade + " unidades. 🚩 O navio alcançou sua capacidade máxima de pescado (" + capacidadeCarga + ").");
        } else {
            System.out.println("❌ Capacidade de carga excedida! Não é possível armazenar " + quantidade + " unidades de pescado.");
        }
    }

    // Apresenta a quantidade atual de pescado
    public void apresentarQuantidadeDePescado() {
        System.out.println("Quantidade de pescado a bordo: " + cargaAtual + " / " + capacidadeCarga);
    }

    // Desembarca todo o pescado
    public void desembarcarTodoPescado() {
        if (cargaAtual > 0) {
            System.out.println("Desembarcando " + cargaAtual + " unidades de " + tipoPesca + " no frigorífico do porto.");
            cargaAtual = 0;
        } else {
            System.out.println("Não há pescado a ser desembarcado.");
        }
    }

    // Implementações dos métodos abstratos da superclasse Navio
    @Override
    public void partir() {
        System.out.println("O navio pesqueiro " + getNome() + " está partindo.");
    }

    @Override
    public void navegar() {
        System.out.println("O navio pesqueiro " + getNome() + " está navegando com " + cargaAtual + " unidades de " + tipoPesca + " a bordo.");
    }

    @Override
    public void parar() {
        System.out.println("O navio pesqueiro " + getNome() + " parou no porto.");
    }

    @Override
    public void atracar() {
        System.out.println("O navio pesqueiro " + getNome() + " está atracando no porto.");
    }
}