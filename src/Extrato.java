import java.time.LocalDateTime;

public class Extrato {
    private String valorSacado;
    private LocalDateTime hora = LocalDateTime.now();

    public Extrato(String valorSacado, LocalDateTime now) {
        this.valorSacado = valorSacado;
        this.hora = now;
    }
    public String getValorSacado() {
        return valorSacado;
    }
    public void setValorSacado(String valorSacado) {
        this.valorSacado = valorSacado;
    }
    public LocalDateTime getHora() {
        return hora;
    }
    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }
    
}
