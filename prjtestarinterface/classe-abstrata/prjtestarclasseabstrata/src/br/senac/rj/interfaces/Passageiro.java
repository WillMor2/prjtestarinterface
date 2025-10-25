/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senac.rj.interfaces;


public interface Passageiro {

    // embarque de passageiros
    public void embarcarPassageiros(int quantidadePassageiros);

    // desembarque de passageiros
    public void desembarcarPassageiros(int quantidadePassageiros);

    // apresentar quantidade de passageiros embarcados
    public void apresentarQuantidadePassageirosEmbarcados();

    // desembarque de todos os passageiros
    public void desembarcarTodosOsPassageiros();
}
