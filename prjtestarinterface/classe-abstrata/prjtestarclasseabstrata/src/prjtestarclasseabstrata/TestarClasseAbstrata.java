/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prjtestarclasseabstrata;

import classes.publicas.NavioPassageiro;
import classes.publicas.NavioPesqueiro;
import classes.publicas.TipoPesca;


public class TestarClasseAbstrata {

 public static void main(String[] args) {

        System.out.println("===== TESTANDO NAVIO DE PASSAGEIROS =====");
        NavioPassageiro navioPassageiro = new NavioPassageiro("Deu a Louca no Roberto Carlos", 70000, 320, 1000);

        navioPassageiro.partir();
        navioPassageiro.embarcarPassageiros(400);
        navioPassageiro.apresentarQuantidadePassageirosEmbarcados();

        navioPassageiro.embarcarPassageiros(700); // excede capacidade
        navioPassageiro.navegar();
        navioPassageiro.atracar();

        navioPassageiro.desembarcarPassageiros(200);
        navioPassageiro.apresentarQuantidadePassageirosEmbarcados();

        navioPassageiro.desembarcarTodosOsPassageiros();
        navioPassageiro.parar();

        System.out.println("\n===== TESTANDO NAVIO PESQUEIRO =====");
        NavioPesqueiro navioPesqueiro = new NavioPesqueiro("Pescador Parrudo", 30000, 200, 5000, TipoPesca.CAMARAO);

        navioPesqueiro.partir();
        navioPesqueiro.navegar();

        navioPesqueiro.pescar(2000);
        navioPesqueiro.pescar(4000); // tenta ultrapassar a capacidade

        navioPesqueiro.apresentarQuantidadeDePescado();

        navioPesqueiro.atracar();
        navioPesqueiro.desembarcarTodoPescado();
        navioPesqueiro.parar();

        System.out.println("\n===== TESTE FINALIZADO =====");
    }
        
}
