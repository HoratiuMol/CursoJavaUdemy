import javax.swing.*;
import java.util.Scanner;
import java.util.InputMismatchException;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        //String numeroStr = scanner.nextLine();
        int numeroDecimal =0;
        try{
            numeroDecimal =  scanner.nextInt();//Integer.parseInt(numeroStr);
        }catch (InputMismatchException e){
            System.out.println("Error debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String mensajeBinario = "numero binario = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        String mensajeOctal = "\n numero octal de = " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        String mensajeHexa = "\n numero hexadecimal de  = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);


        String mensaje = mensajeBinario;
        mensaje += mensajeOctal;
        mensaje += mensajeHexa;
        System.out.println(mensaje);

    }
}
