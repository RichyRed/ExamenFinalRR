package ejerciciosParcialFinal.ej5Decorator;

public class Xiaomi implements ICelular{
    @Override
    public Integer anadir() {
        System.out.println("Se agrego un Xiaomi de 1600 Bs");
        return 1600;
    }
}
