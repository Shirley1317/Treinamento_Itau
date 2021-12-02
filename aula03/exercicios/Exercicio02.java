package exercicios;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
               
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, media;

        // entrada de dados
        System.out.println(" Digite a primeira nota:");
        nota1 = entrada.nextDouble(); // ler valor decimal do teclado

        System.out.println(" Digite a segunda nota: ");
        nota2 = entrada.nextDouble(); // ler valor decimal do teclado

        // processamento
        media = ((nota1 + nota2)/2);

        // saida

        System.out.println("A média é:" + media);



               
        entrada.close();
    }
    
}
