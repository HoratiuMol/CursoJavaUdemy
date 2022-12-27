class Persona{
    private String nombre;

    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public String leerNombre(){
        return this.nombre;
    }
}
public class PasarPorReferencia2 {
    public static void main(String[] args) {

        Persona persona = new Persona();//integer primitva se pasa por valor, no por referencia, es un primitivo no un objeto
        persona.modificarNombre("Andrés");


        System.out.println("iniciamos el método main");
        System.out.println("persona = " + persona.leerNombre());
        System.out.println("Antes de llamar al método test ");

        test(persona); //metodo(argumento) acá le pasamos el parámetro

        System.out.println("despues de llamar al método test");
        System.out.println("persona = " + persona.leerNombre());
        System.out.println("Finaliza el método main con los datos modificados");

    }

    public static void test(Persona persona) {//void no retorna nada

        System.out.println("iniciamos el método test");
        persona.modificarNombre("Pepe");
        System.out.println("Finaliza el método test ocn los datos cambiados");
    }
}
