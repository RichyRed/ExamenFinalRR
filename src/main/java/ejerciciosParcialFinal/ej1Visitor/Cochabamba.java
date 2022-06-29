package ejerciciosParcialFinal.ej1Visitor;

public class Cochabamba implements ICiudad {
    private String nombre;
    private int provincias;
    private int habitantes;
    private String clima;
    private double dineroTurismo;

    public Cochabamba(int provincias, int habitantes, String clima) {
        nombre = "Cochabamba";
        this.provincias = provincias;
        this.habitantes = habitantes;
        this.clima = clima;
        dineroTurismo = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getProvincias() {
        return provincias;
    }

    public void setProvincias(int provincias) {
        this.provincias = provincias;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public double getDineroTurismo() {
        return dineroTurismo;
    }

    public void setDineroTurismo(double dineroTurismo) {
        this.dineroTurismo = dineroTurismo;
    }

    @Override
    public void gastarDinero(ITurista turista) {
        turista.viajarCBBA(this);
    }

    public void showInfo(){
        System.out.println("<<< INFORMACION DE LA CIUDAD DE COCHABAMBA >>>");
        System.out.println("Nombre: " + nombre);
        System.out.println("Numero de provincias: " + provincias);
        System.out.println("Numero de habitantes: " + habitantes);
        System.out.println("Clima: " + clima);
        System.out.println("Dinero recibido por turismo: " + dineroTurismo);
        System.out.println();
    }
}
