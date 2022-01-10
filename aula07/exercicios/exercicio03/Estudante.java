package exercicios.exercicio03;

public class Estudante extends Pessoa { // usa o construtor da Pessoa
        private String curso ;

    public Estudante ( String nome, String telefone, String curso) {
        super(nome, telefone);
        this.curso = curso;
        
    }
@Override
public String toString () {
    return super.toString() + " - " + curso;
}
    
}
