package ejerciciosParcialFinal.ej5Decorator;

public class MemAlmacenamiento extends Decorator {

    public MemAlmacenamiento(ICelular componente) {
        super(componente);
    }

    public Integer anadir() {
        System.out.println("Se agrego una memoriaAlm de 100 Bs.");
        return super.anadir()+100;
    }

}
