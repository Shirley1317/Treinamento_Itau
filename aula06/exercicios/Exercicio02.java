package exercicios;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, num3, resp;
    

        System.out.println("Digite 3 números inteiros:");
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();
        num3 = entrada.nextInt();
        
        resp = menor(num1, num2, num3);

        System.out.println("o menor é "+ resp);

        System.out.println("o menor número é " + menor(num1, num2, num3));

        entrada.close();

    }  
    public static int menor(int n1, int n2, int n3) {
        int resposta;

        if (n1 <= n2 && n1 <= n3) {
            resposta = n1;

        } else {
                    
            if (n2 <= n1 && n2 <= n3){
            resposta = n2;

        } else {
            resposta = n3;
        }
                   
    }

    return resposta;
    
    }
}
