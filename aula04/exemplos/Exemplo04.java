public class Exemplo04 {
    String palavra1, palavra2;

    palavra1 = "laranja";
    palavra2 = "goiaba";

    System.out.println(palavra1.equals(palavra2)); // compara as duas variáveis strings (texto)
    System.out.println(palavra1.equals("laranja")); // compara a variavel com um texto
    System.out.println(palavra1.equals("Laranja")); // compara e faz a diferença maiúscula e minúscula
    System.out.println(palavra1.equalsIgnoreCase("Laranja")); // não faz diferença maiúscula e minúscula 
    
    
}
