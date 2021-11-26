package zooAnimales;

import java.util.List;

public class Anfibio extends Animal {

    public static int ranas;
    public static int salamandras;

    private List<Anfibio> listado;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
        super(nombre, edad, habitat, genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
    }

    public Anfibio() { }

    public int cantidadAnfibios() {
        return 0;
    }

    @Override
    public String movimiento() {
        return "saltar";
    }

    public void crearRana() { }

    public void crearSalamandra() { }
}
