package br.senac.rj.interfaces;
import br.senac.classes.tipoPesca.TipoPesca;


public interface Pesqueiro {

    public void iniciarPesca(TipoPesca tipo);
        
    public void encerrarPesca();
}