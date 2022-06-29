package ejerciciosParcialFinal.ej4Proxy;

public class Proxy implements IServidor {
    private IServidor servidor1;
    private IServidor servidor2;
    private int contador;

    public Proxy() {
        System.out.println(">>> Iniciando el proxy y los servidores");
        System.out.println();
        servidor1 = new Servidor1();
        servidor2 = new Servidor2();
    }

    public void userLogin(Usuario user){
        int i;
        int numero = user.getId();
        int contador = 0;
        for(i =1; i <= numero; i++){
            if((numero % i)==0){
                contador++;
            }
            if(contador <= 2){
                servidor1.userLogin(user);
            }else{
                servidor2.userLogin(user);
            }
        }
    }

    @Override
    public void atenderUsuarios() {
        servidor1.atenderUsuarios();
        servidor2.atenderUsuarios();
    }
}
