package avaliacao1;

import java.time.LocalDateTime;

public class Transacao {
    
    public int id;
    public String tipo;
    public double valor;
    public LocalDateTime dataHora;
    public String status;
    
    public Transacao() {
    }
    
    public Transacao(int id, String tipo, double valor, LocalDateTime dataHora, String status) {
        this.id = id;
        this.tipo = tipo;
        this.valor = valor;
        this.dataHora = dataHora;
        this.status = status;
    }

    
}
