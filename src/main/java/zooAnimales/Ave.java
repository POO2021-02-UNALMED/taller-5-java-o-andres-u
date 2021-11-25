package zooAnimales;

import java.util.List;

public class Ave extends Animal {

    public static int halcones;
    public static int aguilas;

    private List<Ave> listado;
    private String colorPlumas;

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
    }

    public Ave() { }

    public int cantidadAves() {
        return halcones + aguilas;
    }

    @Override
    public String movimiento() {
        return "volar";
    }

    public void crearHalcon(Ave ave) {
        halcones++;
    }

    public void crearAguila(Ave aguila) {
        aguilas++;
    }
}
