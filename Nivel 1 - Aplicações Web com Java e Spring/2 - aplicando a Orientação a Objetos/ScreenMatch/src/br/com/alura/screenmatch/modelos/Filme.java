package br.com.alura.screenmatch.modelos;

public class Filme {
    public String nome;
    public int anoLancamento;
    public boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalAvaliacoes;
    public int duracaoMinutos;

    public int getTotalAvaliacoes(){
        return totalAvaliacoes;
    }

    public void exibiFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    public double pegaMedia() {
        return somaDasAvaliacoes / totalAvaliacoes;
    }
}
