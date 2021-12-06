package exemplos;

public class Exemplo02 {
    public static void main(String[] args) {
        int cont;

        cont = 1 ;

        while (cont < 5 ) {
            System.out.print(cont + " "); // print sem ln, não pula para proxima linha
            cont++; // cont = cont +1;
            // cont += 2; // cont = cont + 2;
            
            
        }

        System.out.println("Final : " + cont);

      
            
        }

    private static int extracted() {
        int cont;
        cont = 1;
        return cont;
    }
    }
    

