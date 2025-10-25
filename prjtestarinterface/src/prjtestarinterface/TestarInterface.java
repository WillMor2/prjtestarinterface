package prjtestarinterface;

import br.senac.classes.concretas.NavioPassageiro;
import br.senac.classes.concretas.NavioPesqueiro;
import br.senac.classes.tipoPesca.TipoPesca;


public class TestarInterface {

 public static void main(String[] args) {

    NavioPassageiro navioPassageiro = new NavioPassageiro("Missao Impossivel",400); 
    navioPassageiro.embarcar(200);
    navioPassageiro.partir();
    navioPassageiro.navegar();
    navioPassageiro.desembarcar(175);
    navioPassageiro.atracar();
    navioPassageiro.parar();

        System.out.println("--------------------------------");
        
   // Criando um navio pesqueiro
    NavioPesqueiro navioPesqueiro = new NavioPesqueiro("Salve Jorge", 35);
    navioPesqueiro.partir();
    navioPesqueiro.navegar();
    navioPesqueiro.iniciarPesca(TipoPesca.PROFISSIONAL);
    navioPesqueiro.encerrarPesca();
    navioPesqueiro.atracar();
    navioPesqueiro.parar(); 
    }
        
}
