package ejerciciosParcialFinal.ej4Proxy;

import java.util.ArrayList;
import java.util.List;

public class Servidor1 implements IServidor {
    private List<Usuario> listOfUsers;

    public Servidor1() {
        listOfUsers = new ArrayList<>();
    }

    @Override
    public void userLogin(Usuario user) {
        listOfUsers.add(user);
    }

    @Override
    public void atenderUsuarios() {
        for (Usuario user:listOfUsers) {
            System.out.println("Servidor 1 guarda al usuario (primo): " + user.getId());
            user.showInfo();
        }
    }
}
