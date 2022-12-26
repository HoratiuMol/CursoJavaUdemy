public class SentenciaSwitchCase {
    public static void main(String[] args) {

        byte num=1;
        int mes=12;
        String nombreMes=null;
        switch(mes) {
            case 1:
                nombreMes="Enero";
                break;
            case 2:
                nombreMes="Febrero";
                break;
            case 3:
                nombreMes="Marzo";
                break;
            case 4:
                nombreMes="Abril";
                break;
            case 5:
                nombreMes="Mayo";
                break;
            case 6:
                nombreMes="Junio";
                break;
            case 7:
                nombreMes="Julio";
                break;
            case 8:
                nombreMes="Agosto";
                break;
            case 9:
                nombreMes="Septiembre";
                break;
            case 10:
                nombreMes="octubre";
                break;
            case 11:
                nombreMes="Noviembre";
                break;
            case 12:
                nombreMes="Diciembre";
                break;
            default:
                nombreMes="indefinido";

        }

        System.out.println("nombreMes = " + nombreMes);

        switch(num){
            case 0:
                System.out.println("El numero es 0 ");
                break;
            case 1:
                System.out.println("El num es 1 ");
                break;
            case 2:
                System.out.println("El nume es 2 ");
                break;
            case 3:
                System.out.println("El num es 3 ");
                break;
            default:
                System.out.println("Num o caracter desconocido: ");
        }

        String nombre = "andres";

        switch (nombre){
            case "admin":
                System.out.println("Hola admin ");
                break;
            case "andres":
                System.out.println("Hola Andres");
                break;
            case "pepe":
                System.out.println("Hola pepe");
                break;
            default:
                System.out.println("Usuario desconocido");
        }
    }
}
