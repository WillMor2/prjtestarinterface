
package br.senac.superclasse;


/*
 * Esta classe representa a classe abstrata Navio
 */
public abstract class Navio {

    private String nome;
    private int capacidade;

    public Navio() {}
    
    

    public Navio(String nome,int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    // Métodos que serão sobrescritos nas subclasses
    public void partir() {
        System.out.println("Navio genérico " + nome + " partiu.");
    }


    public void atracar() {
        System.out.println("Navio genérico " + nome + " atracou.");
    }


    public void navegar() {
        System.out.println("Navio genérico " + nome + " navegando.");
    }


    public void parar() {
        System.out.println("Navio genérico " + nome + " parou.");
    }

}

