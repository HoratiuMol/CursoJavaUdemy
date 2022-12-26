public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {

        String texto= new String("creando un objeto de la clase String ");

        Integer num= new Integer(7);
        Boolean b1= texto instanceof String;

        System.out.println("Es del tipo String?= " + b1);

        b1 = texto instanceof Object;
        System.out.println("b1 es del tipo Object = " + b1);

        b1 = num instanceof Integer;
        System.out.println("b1 es del tipo integer= " + b1);

        b1 = num instanceof Number;
        System.out.println("b1 es del tipo Number= " + b1);

        b1 = num instanceof Object;
        System.out.println("b1 es del tipo Object= " + b1);

        Double decimal= 45.45;
        b1= decimal instanceof Number;
        System.out.println("b1 decimal es del tipo nummber= " + b1);



    }
}
