package ejerciciosParcialFinal.ej5Decorator;

public class Carcasa extends Decorator {

    public Carcasa(ICelular componente) {
        super(componente);
    }

    public Integer anadir() {
        System.out.println("Se agrego una carcasa de 80 Bs.");
        return super.anadir() + 80;
    }
}
