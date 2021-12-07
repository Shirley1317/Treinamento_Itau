package exercicio03;

public class Veiculo {
    public String marca, modelo;    
    private double consumo;

    //construtor
    Veiculo(String marca, String modelo, double consumo) {
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
    }
    //construtor

    void exibirDados() {
        System.out.println("Marca: " + marca + " Modelo: " + modelo);

    }
    double obterConsumo() {
        return consumo;
    }
    public void alterarConsumo(double novoConsumo) {
        if(novoConsumo > 0) {
            consumo = novoConsumo;
        }
    }
    
}
