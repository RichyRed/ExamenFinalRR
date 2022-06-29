package ejerciciosParcialFinal.ej4Proxy;

import java.util.ArrayList;
import java.util.List;

public class Servidor2 implements IServidor {
    private List<Usuario> listOfUsers;

    public Servidor2() {
        listOfUsers = new ArrayList<>();
    }

    @Override
    public void userLogin(Usuario user) {
        listOfUsers.add(user);
    }

    @Override
    public void atenderUsuarios() {
        for (Usuario user:listOfUsers) {
            System.out.println("Servidor 2 guarda al usuario (no primo): " + user.getId());
            user.showInfo();
        }
    }
}
