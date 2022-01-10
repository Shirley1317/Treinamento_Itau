package exercicios.exercicio03;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa ("Alberto " , " 11-99999-9999");
        Pessoa pessoa2 = new Pessoa("Antonio");

        Estudante estudante = new Estudante("André", "11-99999-9999", "TI");
        Professor prof = new Professor("Adriana", "11-99998-2537", 2500);

        System.out.println(pessoa.toString());
        System.out.println(pessoa2.toString());
        System.out.println(estudante.toString());

        System.out.println(prof); // .toString()
        
    }
    
}
