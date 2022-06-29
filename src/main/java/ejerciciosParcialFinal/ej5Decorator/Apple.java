package ejerciciosParcialFinal.ej5Decorator;

public class Apple implements ICelular{
    @Override
    public Integer anadir() {
        System.out.println("Se agrego un IPhone de 3000 Bs.");
        return 3000;
    }
}
