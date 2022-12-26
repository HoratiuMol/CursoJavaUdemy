import javax.swing.*;
import java.sql.SQLOutput;

public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = null;
        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);
        //System.out.println(curso.toUpperCase()); //nullPointerExepction pues se trata de sacar un objeto nunll, y se quiebra
        //se podría usar un tryCatch pero es mejor prevenir, asegurarse que tenga una referencia, una variable
        if (esNulo) {
            curso = " programación java";
        }
        boolean esVacio = curso.length() == 0;
        System.out.println("esVacio = " + esVacio);

        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);

        boolean esBlanco = curso.isBlank(); // diferencia entre blanco y vacío
        System.out.println("esBlanco = " + esBlanco);

        if (esBlanco==false) { //laforma mas segura de validar es con "isBlank", es la mas SEGURA
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso));
        }
    }
}
