package exercicios.exercicio01;

public class Relogio {
    private int hora, minuto, segundo; // int = tipo // exemplo int, string, double variavel

    public Relogio (int hora, int minuto, int segundo) { // construtor / variaveis
        setHora(hora); //colocamos setHora para não aceitar
        setMinuto(minuto); // usamos o mesmo nome para variavel e o conteudo, por isso usamos o this. para diferenciar
        setSegundo(segundo);
    }

    public int getHora() {
         return hora;
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
        }
    } 

    public int geSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
        }
    } 
    
        
    public String getHoraAtual() { // metodo relogio
        //return hora + ":" +  minuto + ":" + segundo; sem formatação
        return String.format("%02d:%02d:%02d", hora, minuto, segundo); // usamos "%02d" para formatar a hora com o zero a esquerda;


    }
        
    }
        
  
