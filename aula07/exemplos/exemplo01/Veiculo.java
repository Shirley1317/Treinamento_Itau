package exemplos.exemplo01;

public class Veiculo {
    private String marca, modelo;    
    private double consumo;// so pode ser usado dentro da classe

    //construtor
    public Veiculo(String marca, String modelo, double consumo) {
        this.marca = marca;
        this.modelo = modelo;
        setConsumo (consumo) ;
    }
    //construtor

    public void exibirDados() {
        System.out.println("Marca: " + marca + " Modelo: " + modelo);

    }
    public double getConsumo() { // get para obter o valor
        return consumo;
    }
    public void setConsumo(double novoConsumo) { // set para modificar o valor
        if(novoConsumo > 0) {
            consumo = novoConsumo;
        }
    }
    
}
