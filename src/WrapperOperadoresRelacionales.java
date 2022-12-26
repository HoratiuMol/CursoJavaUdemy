public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {
        Integer num1=Integer.valueOf(1000);
        Integer num2= num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto? " + (num1==num2));

        num2=500;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto? " + (num1==num2)); //si ponesmo 127 (limite) hace una comparación por valor,
        //a partir de 127 compara sin valor, ya que no transforma en primitivo. Sino, compara por Instancia.

        System.out.println("tienen el mismo valor?: " + (num1.equals(num2)));
        System.out.println("tienen el mismo valor?: " + (num1.intValue() == num2.intValue()));
        
        boolean condicion = num1 > num2; //autounboxing se utiliza aqui de forma automática, ya que se pasa la referencia a primitvo. 
        //aqui invoca el "intValue" y lo compara ne valor no en instancia.
        System.out.println("condicion = " + condicion);
        
        
    }
}
