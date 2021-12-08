package exercicios.exercicio03;

public class Pessoa {
    private String nome, telefone; // criamos uma classe

    public Pessoa (String nome) {
        
    }

    public Pessoa ( String nome, String telefone) { // criamos o construtor
        
        this.nome = nome;
        this.telefone = telefone;

    }

    public String getDados() { // criamos um método que retorna o nome e o telefone
        return nome + " - " + telefone;

    }

    
}