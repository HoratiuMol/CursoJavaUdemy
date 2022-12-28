import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {

    public static void main(String[] args) {
        Date fecha= new Date();
        System.out.println("fecha = " + fecha);
        SimpleDateFormat df = new SimpleDateFormat("dd MMMM, yyyy - G - z"); //recomendable buscar los distintos date format en google,formato Universal
        String fechaStr=df.format(fecha);
        long j=0;
        for(int i=0;i< 10000000;i++){
            j+=i;
        }
        System.out.println("j = " + j);

        Date fecha2=new Date();
        long tiempoFinal =fecha2.getTime() - fecha.getTime();
        System.out.println("tiempo transcurrido en el for 0 " + tiempoFinal);
        System.out.println("fechaStr = " + fechaStr);


    }
}
