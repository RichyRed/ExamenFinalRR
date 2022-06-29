package ejerciciosParcialFinal.ej1Visitor;

public class Client {
    public static void main(String[] args){
        Turista turista = new Turista("Carlos Andrade", 100, "123456");

        LaPaz lp = new LaPaz(40, 300, "Frio");
        Cochabamba cbba = new Cochabamba(28, 250, "Templado");
        SantaCruz scz = new SantaCruz(50, 500, "Calido");

        lp.gastarDinero(turista);
        cbba.gastarDinero(turista);
        scz.gastarDinero(turista);
    }
}
