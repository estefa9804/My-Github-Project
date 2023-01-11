package co.com.proyectojava;

import java.time.LocalDateTime;
import java.util.Date;

public class Premio {

    private TipoPremio tipoPremio;
    private double totalGanado;
    private LocalDateTime fechaCaducidad;

    public Premio(TipoPremio tipoPremio, double totalGanado, LocalDateTime fechaCaducidad) {
        this.tipoPremio = tipoPremio;
        this.totalGanado = totalGanado;
        this.fechaCaducidad = fechaCaducidad;
    }

    public void calcularPremio(){
        // Pendiente implementar este metodo.
    }

    // Metodos Get y Set

    public TipoPremio getTipoPremio() {
        return tipoPremio;
    }

    public void setTipoPremio(TipoPremio tipoPremio) {
        this.tipoPremio = tipoPremio;
    }

    public double getTotalGanado() {
        return totalGanado;
    }

    public void setTotalGanado(double totalGanado) {
        this.totalGanado = totalGanado;
    }

    public LocalDateTime getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDateTime fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
}
