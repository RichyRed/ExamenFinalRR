package ejerciciosParcialFinal.ej3Bridge;

public class Twitter implements IRedSocial {
    private ISistema sistema;

    public Twitter(ISistema sistema) {
        this.sistema = sistema;
    }

    @Override
    public void mostrarDatos() {
        System.out.println(">>> Mostrando los datos por Twitter");
        sistema.mostrarDatos();
    }
}
