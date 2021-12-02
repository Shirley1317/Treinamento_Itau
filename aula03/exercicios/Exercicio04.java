package exercicios;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salarioMinimo, kwConsumido;
        double valorKw, valorTotal, valorComDesconto;

        // entrada
        System.out.println(" Digite o valor do salario minimo:");
        salarioMinimo = entrada.nextDouble(); 
        System.out.println(" Digite o consumo em KW:");
        kwConsumido = entrada.nextDouble(); 

        // processamento
        valorKw = salarioMinimo / 500;
        valorTotal = valorKw + kwConsumido;

        // saida
        System.out.println(" 1 Kw custa: " + valorKw);
        System.out.println(" Valor Total: " + valorTotal);
        

        entrada.close();
        
    }
    
}
