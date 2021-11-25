package gestion;

public class Zoologico {

    private String nombre;
    private String ubicacion;
    private Zona[] zonas;

    public Zoologico(String nombre, String ubicacion, Zona[] zonas) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.zonas = zonas;
    }

    public Zoologico() {}

    public void agregarZonas(Zona zona) {

    }

    public int cantidadTotalAnimales() {
        return 0;
    }
}
