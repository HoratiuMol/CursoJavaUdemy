import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");


        try {
            System.out.println("Ingrese una fecha con formato 'yyyy-MM-dd'");
            Date fecha = format.parse(s.next());//debemos usar try y cach parar las excepciones
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));

            Date fecha2 = new Date();


            if(fecha.after(fecha2)){
                System.out.println("fecha del usuarios es mayor que la fecha actual ");
            } else if (fecha.before(fecha2)) {
                System.out.println("la fecha del usuario es anterior a la fecha actual");
            }else if(fecha.equals(fecha2)){
                System.out.println("la fecha ingresada es igual a la actual");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
