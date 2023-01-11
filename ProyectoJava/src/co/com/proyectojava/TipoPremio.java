package co.com.proyectojava;

public class TipoPremio {

    private String idTipoPremio;

    private String nombre;

    /**
     * Constructor.
     * @param idTipoPremio
     * @param nombre
     */
    public TipoPremio(String idTipoPremio, String nombre) {
        this.idTipoPremio = idTipoPremio;
        this.nombre = nombre;
    }

    public void calcular() {
        // Pendiente implementar este metodo.
    }

    // Metodos Get y Set

    public String getIdTipoPremio() {
        return idTipoPremio;
    }

    public void setIdTipoPremio(String idTipoPremio) {
        this.idTipoPremio = idTipoPremio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



}
