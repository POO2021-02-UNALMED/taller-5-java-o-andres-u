package zooAnimales;

import java.util.List;

public class Reptil extends Animal {

    public static int iguanas;
    public static int serpientes;

    private List<Reptil> listado;
    private String colorEscamas;
    private int largoCola;

    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
    }

    public Reptil() { }

    public int cantidadReptiles() {
        return 0;
    }

    @Override
    public String movimiento() {
        return "none";
    }

    public void crearIguana() {

    }

    public void crearSerpiente() {
        
    }
}
