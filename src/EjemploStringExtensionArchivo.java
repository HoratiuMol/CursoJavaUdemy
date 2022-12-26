public class EjemploStringExtensionArchivo  {
    public static void main(String[] args) {
        
        String archivo ="alguna.imagen.js";
        int i=archivo.indexOf(".");
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(14) = " + archivo.substring(14));
        System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(i+1));
        System.out.println("archivo.indexOf('.') = " + archivo.lastIndexOf("."));
    }
}
