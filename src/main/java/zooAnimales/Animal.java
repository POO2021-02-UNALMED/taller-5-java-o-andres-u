package zooAnimales;

import gestion.Zona;

public class Animal {
    private static int totalAnimales;

    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;

    public Animal(String nombre, int edad, String habitat, String genero, Zona zona) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.zona = zona;
    }

    public Animal() { }

    public String movimiento() {
        return "desplazarse";
    }

    public String totalPorTipo() {
        return "Mamiferos: #\n" +
                "Aves: #\n" +
                "Reptiles: #\n" +
                "Peces: #\n" +
                "Anfibios: #";
    }

    @Override
    public String toString() {
        return String.format("Mi nombre es %s, tengo una edad de %d, habito en %s y mi genero es %s, la zona en la que me ubico es %s, en el %s", nombre, edad, habitat, genero, zona, zona.getZoo().getNombre());
    }
}
