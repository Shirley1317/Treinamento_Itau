package exemplos.exemplo01;

public class AppVeiculo {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo(" Ford ", " Focus ",  -15.5); //construtor
       
        veiculo.exibirDados();
        //veiculo.consumo = -10; // erro! não podemos 
        veiculo.setConsumo(-20);

        System.out.println("Consumo : " + veiculo.getConsumo());

    }
    
    
}
