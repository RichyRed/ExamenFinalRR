package ejerciciosParcialFinal.ej3Bridge;

public class Face implements IRedSocial {
    private ISistema sistema;

    public Face(ISistema sistema) {
        this.sistema = sistema;
    }

    @Override
    public void mostrarDatos() {
        System.out.println(">>> Mostrando los datos por Face");
        sistema.mostrarDatos();
    }
}
