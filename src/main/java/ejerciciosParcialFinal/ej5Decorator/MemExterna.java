package ejerciciosParcialFinal.ej5Decorator;

public class MemExterna extends Decorator {

    public MemExterna(ICelular componente) {
        super(componente);
    }

    public Integer anadir() {
        System.out.println("Se agrego una memoriaExtr de 150 Bs.");
        return super.anadir()+150;
    }

}
