package modelo;

public class ContaPoupanca extends Conta {
    private double taxaOperacao;

    public ContaPoupanca (int numero) {// criamos um construtor
        super(numero); // que recebe o valor de conta
    }
    
    public void setTaxaOperacao(double novaTaxa) {
        taxaOperacao = novaTaxa;
    }

    @Override
    public boolean saque(double valor) {
        if(valor + taxaOperacao <= getSaldo()) {
            return super.saque(valor + taxaOperacao);
     }
        return false;   
    }   

    @Override
    public String toString() {
        return "CP : " + super.toString() + " Taxa : " + taxaOperacao;
    }
}