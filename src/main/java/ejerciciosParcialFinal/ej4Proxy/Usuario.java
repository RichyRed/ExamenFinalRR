package ejerciciosParcialFinal.ej4Proxy;

public class Usuario {
    private int id;
    private String nombre;
    private int pwd;

    public Usuario(int id, String nombre, int pwd) {
        this.id = id;
        this.nombre = nombre;
        this.pwd = pwd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPwd() {
        return pwd;
    }

    public void setPwd(int pwd) {
        this.pwd = pwd;
    }

    public void showInfo(){
        System.out.println("--- Info Usuario ----");
        System.out.println("Username: " + nombre);
        System.out.println("El ID del usuario es: " + id);
        System.out.println();
    }
}
