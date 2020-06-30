package app.aggregation.entities;

/**
 * Motorista
 */
public class Motorista {

    private String nome;
    private int habilitacao;

    public Motorista(){}

    public Motorista(String nome, int habilitacao) {
        this.nome = nome;
        this.habilitacao = habilitacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHabilitacao() {
        return habilitacao;
    }

    public void setHabilitacao(int habilitacao) {
        this.habilitacao = habilitacao;
    }

    @Override
    public String toString() {
        return "Motorista: " + nome + "\nHabilitacao: " + habilitacao;
    }
}