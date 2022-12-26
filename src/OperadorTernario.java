import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        /*variable = condicion ? si es verdadero: si es falso*/

        String variable=7==5 ?"si, es veradero" : "si, es falso";
        System.out.println("variable = " + variable);

        String estado ="";
        double promedio= 6.2;

        double matematicas= 0.0;
        double ciencias=0.0;
        double historia=0.0;

        Scanner s=new Scanner(System.in);
        System.out.println("Ingrese la nota de matemáticas entre 2 y 7 ");
        matematicas=s.nextDouble();
        System.out.println("Ingrese la nota de ciencias entre 2 y 7 ");
        ciencias=s.nextDouble();
        System.out.println("Ingrese la nota de historia entre 2 y 7 ");
        historia=s.nextDouble();

        promedio =( matematicas + ciencias + historia)/3;

        estado = promedio >= 5.49 ? "aprobado" : "rechazado";
        System.out.println("estado = " + estado);
        System.out.println("promedio = " + promedio);

        /*if(promedio>=5.49){
            estado = "aprobado";
        }else{
            estado="rechazado";
        } todos los if-else se podría sustituir por un operador ternario, simplifcia el código*/
    }
}
