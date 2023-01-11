package co.com.proyectojava;

public class CompradorLoteria {

    private String nombre;

    private String direccion;

    private long telefono;

    /**
     * Constructor.
     * @param nombre Nombre del Comprador.
     * @param direccion Direccion del comprador de la loteria.
     * @param telefono Telefono.
     */
    public CompradorLoteria(String nombre, String direccion, long telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    // Metodos Get y Set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
}
