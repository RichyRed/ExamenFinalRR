package ejerciciosParcialFinal.ej4Proxy;

public class Client {
    public static void main(String[] args){
        IServidor proxy = new Proxy();

        proxy.userLogin(new Usuario(11, "Tony", 111));
        proxy.userLogin(new Usuario(8, "Tony", 111));

        proxy.atenderUsuarios();
    }
}
