import java.util.Random;

public class EjemploClaseMathrandom {
    public static void main(String[] args) {
        
        double random=Math.random();
        System.out.println("random = " + random);
        //random *=7;multiplicar por 7
        //System.out.println("random = " + random);
         


        String[] colores ={"azul", "amarillo", "rojo", "verde","blanco","negro","azulclaro","moreno","gris","diez"};
        random *= colores.length;

        random=Math.floor(random);
        System.out.println("colores = " + colores[(int) random]);

        Random randomObj=new Random();
        int randomInt = randomObj.nextInt();
        // int randomInt=randomObj.nextInt(9); nos genera un valor aleatorio entre 0 y 9 pero no se incluye el 9 (9+1) si se incluye
        //int randomInt = 15 + randomObj.nextInt(25-15); nos lo crea entre un rango de 15 y 25, no cluido (25-15+1) si se incluye el 25
        System.out.println("randomInt = " + randomInt);
         
         
    }
}
