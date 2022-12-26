import javax.swing.*;

public class OperadoresAritmeticos {

    public static void main(String[] args) {

        int i=5, j=4, suma = i+ j;

        System.out.println("suma = " + suma);

        System.out.println("i + j = "+ i + j); //es una concatenación, ergo es un String
        System.out.println((i + j) + " i + j = "); //esto es una suma de ints y luego una concatenación
        
        int resta= i - j;
        System.out.println("resta = " + resta);
        System.out.println("i - j = " + (i - j)); //da error si no se usa paréntesis porque se entiende que es una
        //concatenación de string y no de int. SI se marca paréntesis se establece la prioridad de operación
        
        int multi= i*j;
        System.out.println("multi = " + multi);
        
        int div=i/j;
        System.out.println("div = " + div);
        
        float div1=i/j;
        System.out.println("div1 = " + div1);

        float div2= (float)i / (float)j; //se ha de convertir la fuente en un float, no tan solo el resutlado final
        System.out.println("div2 = " + div2);

        int resto = i%j; //se saca el entero mmayor
        System.out.println("resto = " + resto);
        
        resto = 8%5;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        if(numero % 2==0){
            System.out.println("numero par = " + numero);
        }else {
            System.out.println("numero impar = " + numero);
        }
        
    }
}
