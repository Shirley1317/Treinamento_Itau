import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salarioBruto, prestacao;

        System.out.println("Digite o salario bruto:");
        salarioBruto = entrada.nextDouble();
        System.out.println("Digite o valor da prestação:");
        prestacao = entrada.nextDouble();
10    

        if (prestacao <= salarioBruto * 0.3) {
            System.out.println("Emprestimo aprovado");
                    
        }else {
            System.out.println("Emprestimo recusado");
        }


        entrada.close();
    }
    
}
