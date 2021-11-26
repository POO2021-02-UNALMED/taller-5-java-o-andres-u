package zooAnimales;

import java.util.List;

public class Pez extends Animal {

    public static int salmones;
    public static int bacalaos;

    private List<Pez> listado;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
    }

    public Pez() { }

    public int cantidadPeces() {
        return 0;
    }

    @Override
    public String movimiento() {
        return "none";
    }

    public void crearSalmon() { }

    public void crearBacalao() { }
}
