5

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        String entrada;

        try {
            System.out.println("Digite um numero:");
        // numero = teclado.nextInt();
        entrada = teclado.nextLine();
        numero = Integer.parseInt(entrada); // transforma o texto em numero inteiro
        System.out.println("Voce digitou " + numero);
    } catch (InputMismatchException e) {
        System.out.println("Valor invalido.");

        }
        System.out.println("Fim do programa.");

        teclado.close();
        

        }

        
        }
   


    

