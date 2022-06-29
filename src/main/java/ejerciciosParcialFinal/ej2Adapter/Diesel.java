package ejerciciosParcialFinal.ej2Adapter;

import java.util.Random;

public class Diesel implements ICuadratrack {
    private int capacidad;

    public Diesel() {
        capacidad = 0;
    }

    @Override
    public void cargarCombustible() {
        System.out.println("--- Cargando diesel");
        capacidad = new Random().nextInt(50);
        System.out.println("Capacidad: " + capacidad);
        System.out.println();
    }

    @Override
    public void estadoCombustible() {
        System.out.println(">>> Estado del combustible");
        System.out.println("Estado: " + new Random().nextInt(50));
        System.out.println();
    }
}
