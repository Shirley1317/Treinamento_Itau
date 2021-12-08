package exercicios.exercicio03;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa ("Alberto " , " 11-99999-9999");
        Estudante estudante = new Estudante("André", "11-99999-9999", "TI");

        System.out.println(pessoa.getDados());
        System.out.println(estudante.getDados());
        
    }
    
}
