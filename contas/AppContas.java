//import modelo.Conta;
//import modelo.ContaCorrente;
import modelo.ContaEspecial;
import modelo.ContaPoupanca;

public class AppContas {
    public static void main(String[] args) {
        ContaPoupanca conta1 = new ContaPoupanca(123); // tipo Conta
        ContaPoupanca conta2 = new ContaPoupanca(123); // tipo Conta

        conta.setTaxaOperacao(0.1);

        System.out.println(conta);

        conta.deposito(200); // metodo
        System.out.println(conta);

        if (conta.saque(300)) {
            System.out.println("Saque realizado.");
        } else { 
            System.out.println(" Saldo insuficiente.");

        }
        System.out.println(conta);
        

        
        
    }
}
