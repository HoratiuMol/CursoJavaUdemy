import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null,"Ingrese un numero entero");
        int numeroDecimal =0;
        try{
            numeroDecimal = Integer.parseInt(numeroStr);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"error, debe ingresar un numero entero");
            main(args);

            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String mensajeBinario = "numero binario = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        String mensajeOctal = "\n numero octal de = " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        String mensajeHexa = "\n numero hexadecimal de  = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);

        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        int numeroHexadecimal= 0x1f4;
        System.out.println("numeroHexa = " + numeroHexadecimal );

        String mensaje = mensajeBinario;
        mensaje += mensajeOctal;
        mensaje += mensajeHexa;
        JOptionPane.showMessageDialog(null,mensaje);

    }
}
