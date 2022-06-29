package ejerciciosParcialFinal.ej4Proxy;

public class Proxy implements IServidor {
    private IServidor servidor1;
    private IServidor servidor2;

    public Proxy() {
        System.out.println(">>> Iniciando el proxy y los servidores");
        System.out.println();
        servidor1 = new Servidor1();
        servidor2 = new Servidor2();
    }

    public void userLogin(Usuario user){
        if(user.getId() % 2 == 0){
            servidor1.userLogin(user);
        } else {
            servidor2.userLogin(user);
        }
    }

    @Override
    public void atenderUsuarios() {
        servidor1.atenderUsuarios();
        servidor2.atenderUsuarios();
    }
}
