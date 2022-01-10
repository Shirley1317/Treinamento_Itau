import java.util.HashMap;

public class Exemplo01 {
    public static void main(String[] args) {
        // < CHAVE, VALOR>
        HashMap<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Um");
        mapa.put(2, "Dois");
        mapa.put(3, "Tres");

        System.out.println(mapa.get(2));
    }

    
}