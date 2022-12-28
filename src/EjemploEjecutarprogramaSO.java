
import java.sql.SQLOutput;

public class EjemploEjecutarprogramaSO {
    public static void main(String[] args) {

        Runtime rt=Runtime.getRuntime();
        Process proceso;
        try {
            if (System.getProperty("os.name").toLowerCase().startsWith("windows")) {
                proceso = rt.exec("notepad");
            } else if (System.getProperty("os.name").toLowerCase().startsWith("mac")) {
                proceso=rt.exec("textedit");
            } else if(System.getProperty("os.name").toLowerCase().contains("Nux") ||
            System.getProperty("os.name").toLowerCase().contains("Nix")) {

                proceso = rt.exec("textedit");

            }else{
                proceso=rt.exec("gedit");
            }
            proceso.waitFor();
        }catch(Exception e) {
        System.err.println("El comnado es desconocido : " + e.getMessage());
        System.exit(1);
        }
        System.out.println("Se ha cerrado el editor");
        System.exit(0);

    }
}
