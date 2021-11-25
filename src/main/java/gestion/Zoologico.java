package gestion;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {

    private String nombre;
    private String ubicacion;
    private List<Zona> zonas;

    public Zoologico(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.zonas = new ArrayList<>();
    }

    public Zoologico() {}

    public void agregarZonas(Zona zona) {
        zonas.add(zona);
    }

    public int cantidadTotalAnimales() {
        return zonas.stream()
                .mapToInt(zona -> zona.getAnimales().size())
                .sum();
    }
}
