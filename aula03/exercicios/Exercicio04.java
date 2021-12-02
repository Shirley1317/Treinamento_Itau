package exercicios;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final double TAXA_POR_KW = 500; // constante = não pode ser alterado 
        double salarioMinimo, kwConsumido;
        double valorKw, valorTotal, valorComDesconto;

        // entrada
        System.out.println(" Digite o valor do salario minimo:");
        salarioMinimo = entrada.nextDouble(); 
        System.out.println(" Digite o consumo em KW:");
        kwConsumido = entrada.nextDouble(); 

        // processamento
        valorKw = salarioMinimo / TAXA_POR_KW;
        valorTotal = valorKw + kwConsumido;
        valorComDesconto = valorTotal * 0.85;

        // saida
        System.out.println(" 1 Kw custa: R$ " + valorKw);
        System.out.println(" Valor Total: R$ " + valorTotal);
        System.out.println(" Valor com 15% de desconto: R$ " + valorComDesconto);
        

        entrada.close();
        
    }
    
}
