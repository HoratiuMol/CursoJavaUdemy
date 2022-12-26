public class EjemploStringConcatenación {
    public static void main(String[] args) {
        String curso = "Programación Java"; //objeto de referencia, noi primitivo
        String profesor = "Andrés Guzmán";

        String detalle = curso + " con el instructor " + profesor;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;

        System.out.println(detalle + numeroA + numeroB); //concatena, las expresiones se evaluan de IZQ a DRCHA
        //excepto en el caso de los paréntesis
        System.out.println(detalle + (numeroA + numeroB));

        String detalle2 = curso.concat(" con ").concat(profesor);
        System.out.println("detalle2 = " + detalle2);
    }
}
