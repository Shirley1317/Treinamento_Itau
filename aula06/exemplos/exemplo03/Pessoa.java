package exemplos.exemplo03;

public class Pessoa {
    
    // atributos = caracteristicas
    String nome;
    double altura;

    //metodo construtor
    //nome = nome da classe, não pode ter retorno
    Pessoa(String nome, double altura) {
        this.nome = nome;
        this.altura = altura;    

    }

    // métodos = ações
    void apresentar() {
        System.out.println("Olá eu sou " + nome);
        System.out.println(" Tenho altura " + altura);
    }
}
