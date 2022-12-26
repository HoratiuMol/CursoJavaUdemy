public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter='\u0040';
        char decimal= 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter: " + (decimal==caracter));
        //preferencia de los operadores
        //primero se resuelve el true or false , es decir, la paréntesis, y después la concatenación
        //del string
        char simbolo='@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("decimal = caracter: " + (simbolo==caracter));

        char espacio ='\u0020';
        char retroceso ='\b';
        char tabulador='\t';
        char nuevaLinea= '\n';
        char retornoCarro ='\r';
        //se suelen usar en conjunto casi siempre "\n\r"

        System.out.println("numeroByte = " + simbolo);
        System.out.println("Tipo byte corresponde en \t byte:" + tabulador + retroceso + nuevaLinea + retornoCarro + Character.BYTES);
        System.out.println("Tipo byte corresponde en bites a  " + System.getProperty("line.separator")+ Character.SIZE);
        System.out.println("valor maximo Character= " + System.lineSeparator() + Character.MAX_VALUE);
        System.out.println("valor mínimo Character = " + Character.MIN_VALUE);

    }
}
