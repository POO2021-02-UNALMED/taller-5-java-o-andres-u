package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Mamifero extends Animal {

    public static int caballos;
    public static int leones;
    private static List<Mamifero> listado = new ArrayList<>();

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

    public static Mamifero crearCaballo(String nombre, int edad, String genero) {
        caballos++;
        Mamifero caballo = new Mamifero(nombre, edad, "pradera", genero, true, 4);
        listado.add(caballo);
        return caballo;
    }

    public static Mamifero crearLeon(String nombre, int edad, String genero) {
        leones++;
        Mamifero leon = new Mamifero(nombre, edad, "selva", genero, true, 4);
        listado.add(leon);
        return leon;
    }

    public static List<Mamifero> getListado() {
        return listado;
    }

    public static void setListado(List<Mamifero> listado) {
        Mamifero.listado = listado;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
}
