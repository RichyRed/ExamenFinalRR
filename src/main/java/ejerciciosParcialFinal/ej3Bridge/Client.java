package ejerciciosParcialFinal.ej3Bridge;

public class Client {
    public static void main(String[] args){

        SColegio colegio = new SColegio("Amor de Dios", 35, "CI");
        colegio.addEstudiante(new Estudiante("Tony Stark", 17));
        colegio.addEstudiante(new Estudiante("Steve Rogers", 18));

        SEscuela escuela = new SEscuela("Rosa", 60, "Certificado de vacunacion");
        escuela.addEstudiante(new Estudiante("Natasha Romanoff", 15));

        SUni universidad = new SUni("UPB", 200, "Codigo");
        universidad.addEstudiante(new Estudiante("Clint Barton", 21));

        Face facebook = new Face(colegio);
        facebook.mostrarDatos();

        WhatsApp whatsapp = new WhatsApp(escuela);
        whatsapp.mostrarDatos();

        Twitter twitter = new Twitter(universidad);
        twitter.mostrarDatos();
    }
}
