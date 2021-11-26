package zooAnimales;

import java.util.List;

public class Mamifero extends Animal {

    public static int caballos;
    public static int leones;

    private List<Mamifero> listado;
    private boolean pelaje;
    private int patas;

    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
        super(nombre, edad, habitat, genero);
        this.pelaje = pelaje;
        this.patas = patas;
    }

    public Mamifero() { }

    public static int cantidadMamiferos() {
        return caballos + leones;
    }

    public Mamifero crearCaballo(String nombre, int edad, String genero) {
        caballos++;
        Mamifero caballo = new Mamifero(nombre, edad, "pradera", genero, true, 4);
        listado.add(caballo);
        return caballo;
    }

    public Mamifero crearLeon(String nombre, int edad, String genero) {
        leones++;
        Mamifero leon = new Mamifero(nombre, edad, "selva", genero, true, 4);
        listado.add(leon);
        return leon;
    }
}
