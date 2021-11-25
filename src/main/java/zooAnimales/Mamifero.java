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

    public int cantidadMamiferos() {
        return 0;
    }

    public void crearCaballo(Mamifero caballo) {
        caballos++;
    }

    public void crearLeon(Mamifero leon) {
        leones++;
    }
}
