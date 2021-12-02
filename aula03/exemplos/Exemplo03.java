package exemplos;

import java.util.Scanner;

public class Exemplo03 {

   public static void main(String[] args) {
       // cria um Scanner para ler o teclado (System.in)
       Scanner entrada = new Scanner(System.in);
       int idade;

       System.out.println("Digite sua idade: ");
       idade = entrada.nextInt(); // ler um valor inteiro do teclado e guarda na variável idade

       System.out.println("Voce tem " + idade + " anos."); // concatenar ou juntar

       entrada.close();
   } 
}
