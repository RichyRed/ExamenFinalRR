package structuresP3.strProxy;

public class Client {

    public static void main (String []args){

        ISubject proxy = new Proxy("https://google.com","buscar UPB");

        proxy.request();



    }

}
