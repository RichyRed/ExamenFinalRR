package ejerciciosParcialFinal.ej5Decorator;

public class Client {
    public static void main(String[] args) {
        ICelular samsung=new Samsung();
        samsung=new MemExterna(samsung);
        samsung = new MemAlmacenamiento(samsung);
        samsung = new VidrioTemplado(samsung);
        samsung = new Carcasa(samsung);

        ICelular apple = new Apple();
        apple = new MemExterna(apple);
        apple = new MemAlmacenamiento(apple);

        ICelular xiaomi = new Xiaomi();
        xiaomi = new Carcasa(xiaomi);
        xiaomi = new VidrioTemplado(xiaomi);

        System.out.println(samsung.anadir());
        System.out.println();
        System.out.println(apple.anadir());
        System.out.println();
        System.out.println(xiaomi.anadir());
    }
}
