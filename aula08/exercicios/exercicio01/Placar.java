package exercicios.exercicio01;

public class Placar { // modelo
    private String nomeTime1, nomeTime2;
    private int golsTime1, golsTime2;

    public Placar() {  // construtor sem parametros
        nomeTime1 = "Time da casa";
        nomeTime2 = " Visitante";

    }

    public Placar (String nomeTime1, String nomeTime2) { // segundo construtor com nomes
        this.nomeTime1 = nomeTime1;
        this.nomeTime2 = nomeTime2;
        golsTime1 = 0;
        golsTime2 = 0;
    }

    public Placar (String nomeTime1, String nomeTime2, int golsTime1, int golsTime2) {// terceiro construtor com nomes e saldo de gols
        this.nomeTime1 = nomeTime1;
        this.nomeTime2 = nomeTime2;
        this.golsTime1 = golsTime1;
        this.golsTime2 = golsTime2;
    }


    // tres contrutores iniciais diferentes com o intuito de mostrar cada objeto diferente
    public String getPlacar() {
        return nomeTime1 + " " + golsTime1 + " X " + golsTime2 + " " + nomeTime2;
    }
    
}