public class EjemploStringInmutable {
    public static void main(String[] args) {
        String curso = "Programación Java"; //objeto de referencia, noi primitivo
        String profesor = "Andrés Guzmán";

       String resultado = curso.concat(profesor);
        System.out.println("resultado = " + resultado);
        System.out.println("curso = " + curso);
        
        String resultado2 = curso.transform( c -> {
            return c + " con " + profesor;
        }); //se aplica una función de flecha para modificar el valor del string, nada mas
        System.out.println("curso = " + curso);
        System.out.println("resultado2 = " + resultado2);
        String resultado3 = resultado.replace("a", "A");
        System.out.println("resultado3 = " + resultado3);
    }
}
