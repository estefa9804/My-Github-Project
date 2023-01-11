package co.com.proyectojava;

import java.util.Date;

public class Billete {

    private String numeroBillete;

    private DistribuidoraLoteria distribuidoraLoteria;

    private int valorApostado;

    /**
     * Constructor
     * @param numeroBillete Numero del Billete elegido por el usuario.
     * @param distribuidoraLoteria Distribuidora de Loteria que entrego el billete.
     * @param valorApostado Valor apostado.
     */
    public Billete(String numeroBillete, DistribuidoraLoteria distribuidoraLoteria, int valorApostado) {
        this.numeroBillete = numeroBillete;
        this.distribuidoraLoteria = distribuidoraLoteria;
        this.valorApostado = valorApostado;
    }

    // Metodos Get y Set

    public String getNumeroBillete() {
        return numeroBillete;
    }

    public void setNumeroBillete(String numeroBillete) {
        this.numeroBillete = numeroBillete;
    }

    public DistribuidoraLoteria getDistribuidoraLoteria() {
        return distribuidoraLoteria;
    }

    public void setDistribuidoraLoteria(DistribuidoraLoteria distribuidoraLoteria) {
        this.distribuidoraLoteria = distribuidoraLoteria;
    }

    public int getValorApostado() {
        return valorApostado;
    }

    public void setValorApostado(int valorApostado) {
        this.valorApostado = valorApostado;
    }
}