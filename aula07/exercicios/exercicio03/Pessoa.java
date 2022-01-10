package exercicios.exercicio03;

public class Pessoa {
    private String nome, telefone; // criamos uma classe

    public Pessoa (String nome) {
        this.nome = nome;
        this.telefone = "() -  ";
        
    }

    public Pessoa ( String nome, String telefone) { // criamos o construtor
        
        this.nome = nome;
        this.telefone = telefone;

    }
    @Override // indica que este método é uma sobrescrita
        // de um método da superclasse

    public String toString() { // criamos um método que retorna o nome e o telefone
        return nome + " - " + telefone;

    }

    
}