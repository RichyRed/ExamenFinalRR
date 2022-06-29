package ejerciciosParcialFinal.ej5Decorator;

public class Samsung implements ICelular{
    @Override
    public Integer anadir() {
        System.out.println("Se agrego un Samsung de 2500 Bs");
        return 2500;
    }
}
