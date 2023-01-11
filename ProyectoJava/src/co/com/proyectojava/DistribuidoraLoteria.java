package co.com.proyectojava;

public class DistribuidoraLoteria {

    private int idDistribuidora;

    private TipoDistribuidora tipoDistribuidora;

    private boolean habilitadaEntregaPremio;

    /**
     * Constructor
     * @param idDistribuidora Identificador de la Distribuidora.
     * @param tipoDistribuidora Tipo de la Distribuidora.
     * @param habilitadaEntregaPremio Indica si la distribuidora esta habilitada pora entregar el premio.
     */
    public DistribuidoraLoteria(int idDistribuidora, TipoDistribuidora tipoDistribuidora, boolean habilitadaEntregaPremio) {
        this.idDistribuidora = idDistribuidora;
        this.tipoDistribuidora = tipoDistribuidora;
        this.habilitadaEntregaPremio = habilitadaEntregaPremio;
    }

    public void venderBillete() {
        // Pendiente implementar este metodo.
    }

    public void tomarNumeroComprador(){
        // Pendiente implementar este metodo.
    }

    public void generarNumeroAleatorio(){
        // Pendiente implementar este metodo.
    }

    public void entregarPremio(){
    // Pendiente implementar este metodo.
    }

    // Metodos Get y Set

    public int getIdDistribuidora() {
        return idDistribuidora;
    }

    public void setIdDistribuidora(int idDistribuidora) {
        this.idDistribuidora = idDistribuidora;
    }

    public TipoDistribuidora getTipoDistribuidora() {
        return tipoDistribuidora;
    }

    public void setTipoDistribuidora(TipoDistribuidora tipoDistribuidora) {
        this.tipoDistribuidora = tipoDistribuidora;
    }

    public boolean isHabilitadaEntregaPremio() {
        return habilitadaEntregaPremio;
    }

    public void setHabilitadaEntregaPremio(boolean habilitadaEntregaPremio) {
        this.habilitadaEntregaPremio = habilitadaEntregaPremio;
    }
}
