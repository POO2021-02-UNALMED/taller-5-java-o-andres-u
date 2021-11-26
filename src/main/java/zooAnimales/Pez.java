package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Pez extends Animal {

    public static int salmones;
    public static int bacalaos;
    private static List<Pez> listado = new ArrayList<>();

    private String colorEscamas;
    private int cantidadAletas;

    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
    }

    public Pez() { }

    public int cantidadPeces() {
        return salmones + bacalaos;
    }

    @Override
    public String movimiento() {
        return "nadar";
    }

    public static Pez crearSalmon(String nombre, int edad, String genero) {
        salmones++;
        Pez salmon = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
        listado.add(salmon);
        return salmon;
    }

    public static Pez crearBacalao(String nombre, int edad, String genero) {
        bacalaos++;
        Pez bacalao = new Pez(nombre, edad, "oceano", genero, "gris", 6);
        listado.add(bacalao);
        return bacalao;
    }
}
