package ejerciciosParcialFinal.ej5Decorator;

public abstract class Decorator implements ICelular{
    private ICelular componente;
    public Decorator(ICelular componente) {
        this.componente=componente;
    }
    public Integer anadir(){
        return componente.anadir();
    }
}
