package ejerciciosParcialFinal.ej2Adapter;

import java.util.Random;

public class Cuadratrack implements IElectricos {
    private int bateria;

    public Cuadratrack(){
        bateria = 0;
    }

    @Override
    public void cargando() {
        System.out.println("--- Cargando la bateria");
        bateria = new Random().nextInt(20);
        System.out.println("Capacidad: " + bateria);
        System.out.println();

    }

    @Override
    public void estadoElectricidad() {
        System.out.println(">>> Estado de la bateria");
        System.out.println("Estado: " + new Random().nextInt(10));
        System.out.println();
    }
}
