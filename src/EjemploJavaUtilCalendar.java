import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {

    public static void main(String[] args) {
        //por debajo se crea un calendario local (gregoriano, japaneese, etc)
        Calendar calendario =  Calendar.getInstance();

        //calendario.set(2022, calendario.SEPTEMBER ,25, 12, 20);
        calendario.set(Calendar.YEAR, 2022);
        calendario.set(Calendar.MONTH, Calendar.SEPTEMBER);
        calendario.set(Calendar.DAY_OF_MONTH, 22);
        calendario.set(Calendar.HOUR, 7);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.MINUTE, 20);
        calendario.set(Calendar.SECOND, 50);
        calendario.set(Calendar.MILLISECOND, 125);
        Date fecha = calendario.getTime();
        System.out.println("fecha = " + fecha);

        SimpleDateFormat formato= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS a");
        String fechaConFormato = formato.format(fecha);
        System.out.println("fechaConFormato = " + fechaConFormato);
    }
}
