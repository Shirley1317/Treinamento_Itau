package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, cont;

        System.out.println("Digite o número da tabuada");
        numero = entrada.nextInt();

        cont = 0;

        while (cont <= 10) {
            //System.out.println(numero + "x" + cont + "=" + (numero * cont));
            System.out.printf("%d x %2d = %2d\n", numero, cont, (numero * cont));
            cont++;
            
        }
   
            entrada.close();
        }
    }
    
