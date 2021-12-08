package exercicios.exerccicio02;

public class AppEbook {
 
public static void main(String[] args) {
     Ebook livro = new Ebook ("Java ", "Deitel", 300);

        livro.exibirCapa();

        //livro.rettrocederPagina();
        //livro.irParaPagina(350);

        livro.avancarPagina();
        livro.retrocederPagina();
        System.out.println("Pagina atual : " + livro.exibirPagina());
        
    }
        
    }
    

