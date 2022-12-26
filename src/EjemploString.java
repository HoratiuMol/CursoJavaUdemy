public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación Java"; //objeto de referencia, noi primitivo
        String curso2 = new String("programación Java");

        boolean esIgual = curso == curso2; // se compara el objeto, no el valor  del objeto
        System.out.println("curso == curso2  = " + esIgual);

        esIgual = curso.equals(curso2); //se  compara el valor del Tring, no el objeto, ha de ser
        //igual, exactamente igual.
        System.out.println("curso.equals(curso2) = " + esIgual);

        esIgual = curso.equalsIgnoreCase(curso2); //comparación sin tomar en cuenta mayúscula y minúscula
        System.out.println("esIgual = " + esIgual);

        String curso3 = "Programación Java";

        esIgual = curso == curso3; //aqui es igual, ya que al ser un literal se crea una instancia directa
        //&es el mismo objeto pero en distintas variables
        //rara vez se ustará esta forma
        System.out.println("curso == curso3 = " + esIgual);




    }
}
