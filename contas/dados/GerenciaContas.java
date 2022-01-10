package dados;

import java.util.ArrayList;

import modelo.Conta;

public class GerenciaContas {
    private ArrayList<Conta> contas;

    public GerenciaContas() {
        contas = new ArrayList<>();
    }

    public void novaContaCorrente(int numeroConta) {
        // ContaCorrente cc = null;
        // cc = new ContaCorrente(numeroConta);
        // contas.add(cc);

        contas.add(new ContaCorrente (numeroConta));
        
    }
    public void novaContaEspecial(int numeroConta, double limite) {
        contas.add(new ContaEspecial(numeroConta, limite));
    }


    
