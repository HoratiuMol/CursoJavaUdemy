public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {
         String trabalenguas = "trabaLenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());
        System.out.println("trabalenguas.length() = " + trabalenguas.length());
         
         char[] arreglo=trabalenguas.toCharArray();
         int largo =arreglo.length;
        System.out.println("largo = " + largo);

         for(int i=0; i < largo;i++) {

             System.out.print(arreglo[i]);
         }
        System.out.println();
        System.out.println("\ntrabalenguas = " + trabalenguas.split("a"));


        String[] arreglo2 =trabalenguas.split("a"); //separa las palbras o las letras por un elemento marcado
        //en este caso la letra "a"
        int l=arreglo2.length;

        for(int j=0; j<l;j++){

            System.out.println(arreglo2[j]);
        }

        String archivo ="alguna.imagen.pdf";
        String[] archivoArr= archivo.split("\\.");
        int l2 =archivoArr.length;
        for(int j=0; j< l2;j++){

            System.out.println(archivoArr[j]);
        }
        System.out.println("extensión = " + archivoArr[l2-1]);


    }
}


