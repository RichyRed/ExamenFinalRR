package ejerciciosParcialFinal.ej1Visitor;

public class SantaCruz implements ICiudad{
    private String nombre;
    private int provincias;
    private int habitantes;
    private String clima;
    private double dineroTurismo;

    public SantaCruz(String nombre, int provincias, int habitantes, String clima, double dineroTurismo) {
        nombre = "Santa Cruz";

        this.provincias = provincias;
        this.habitantes = habitantes;
        this.clima = clima;
        dineroTurismo = 0;

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
    public void gastarDinero(Turista turista) {

    }
}
