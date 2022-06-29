package ejerciciosParcialFinal.ej5Decorator;

public class VidrioTemplado extends Decorator {

    public VidrioTemplado(ICelular componente) {
        super(componente);
    }

    public Integer anadir() {
        System.out.println("Se agrego un vidrio templado  de 90 Bs");
        return super.anadir()+90;
    }

}
