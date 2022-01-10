package exercicio03;

public class AppVeiculo {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo(" Ford ", " Focus ", 15.5);
       
        veiculo.exibirDados();
        //veiculo.consumo = -10; // erro! não podemos 
        veiculo.alterarConsumo(-20);

        System.out.println("Consumo : " + veiculo.obterConsumo());

    }
    
    
}
