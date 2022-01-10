

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

        } catch(NumberFormatException e) {
            System.out.println("Erro de conversão.");
            System.out.println(e.getMessage());

        } catch(Exception e) {
            System.out.println("Erro.");

        } finally {
            System.out.println("Fechando...");

            teclado.close();
        }
            System.out.println("Fim do programa.");


        

        }

        
      }
   


    

