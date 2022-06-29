package ejerciciosParcialFinal.ej1Visitor;

import java.util.Random;

public class Turista implements ITurista {
    private String nombre;
    private double montoDinero;
    private String ci;

    public Turista(String nombre, int montoDinero, String ci) {
        this.nombre = nombre;
        this.montoDinero = montoDinero;
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMontoDinero() {
        return montoDinero;
    }

    public void setMontoDinero(double montoDinero) {
        this.montoDinero = montoDinero;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    @Override
    public void viajarLP(LaPaz laPaz) {
        // Para la ciudad de la paz un gasto de una cantidad
        // randomica
        System.out.println("VISITANDO LA CIUDAD DE LA PAZ");
        int monto = new Random().nextInt(50);
        if (montoDinero > monto){
            montoDinero = montoDinero - monto;
            System.out.println("Turista ---> Gastando " + monto + " Bs, saldo: " + montoDinero);
            double recibirMonto = laPaz.getDineroTurismo() + monto;
            laPaz.setDineroTurismo(recibirMonto);
            laPaz.showInfo();
        } else {
            System.out.println("Dinero insuficiente, no puede gastar en la ciudad de La Paz");
        }
    }

    @Override
    public void viajarCBBA(Cochabamba cochabamba) {
        //  Para cochabamba se desea gastar el 10% del total de su número de habitantes
        System.out.println("VISITANDO LA CIUDAD DE COCHABAMBA");
        double monto = cochabamba.getHabitantes()*0.1;
        if (montoDinero > monto){
            montoDinero = montoDinero - monto;
            System.out.println("Turista ---> Gastando " + monto + " Bs, saldo: " + montoDinero);
            double recibirMonto = cochabamba.getDineroTurismo() + monto;
            cochabamba.setDineroTurismo(recibirMonto);
            cochabamba.showInfo();
        } else {
            System.out.println("Dinero insuficiente, no puede gastar en la ciudad de Cochabamba");
        }
    }

    @Override
    public void viajarSCZ(SantaCruz santaCruz) {
        // En santa cruz gasta una cantidad igual al 50% de su número de provincias.
        System.out.println("VISITANDO LA CIUDAD DE SANTA CRUZ");
        double monto = santaCruz.getProvincias()*0.5;
        if (montoDinero > monto){
            montoDinero = montoDinero - monto;
            System.out.println("Turista ---> Gastando " + monto + " Bs, saldo: " + montoDinero);
            double recibirMonto = santaCruz.getDineroTurismo() + monto;
            santaCruz.setDineroTurismo(recibirMonto);
            santaCruz.showInfo();
        } else {
            System.out.println("Dinero insuficiente, no puede gastar en la ciudad de Santa Cruz");
        }
    }
}
