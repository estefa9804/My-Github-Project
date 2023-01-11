package co.com.proyectojava;

public enum TipoDistribuidora {

    VENDEDOR_AMBULANTE("VENDEDOR_AMBULANTE"),

    SUSUERTE("SUSUERTE");

    private String tipo;

    private TipoDistribuidora(final String tipo) {
        this.tipo = tipo;
    }
}
