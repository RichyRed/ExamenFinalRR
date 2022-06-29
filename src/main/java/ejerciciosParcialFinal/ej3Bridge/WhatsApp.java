package ejerciciosParcialFinal.ej3Bridge;

public class WhatsApp implements IRedSocial {
    private ISistema sistema;

    public WhatsApp(ISistema sistema) {
        this.sistema = sistema;
    }

    @Override
    public void mostrarDatos() {
        System.out.println(">>> Mostrando los datos por WhatsApp");
        sistema.mostrarDatos();
    }
}
