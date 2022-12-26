public class WrapperBoolean {

    public static void main(String[] args) {
        Integer num1, num2;
        num1=1;
        num2=2;

        boolean primBoolean=num1>num2;//false
        Boolean objetoBoolean = Boolean.valueOf(primBoolean);//esto es una clase wrapper automática
        Boolean objetoBoolean2=Boolean.valueOf("false");
        Boolean objetoBoolean3= false;

        System.out.println("primBoolean = " + primBoolean);
        System.out.println("objetoBoolean = " + objetoBoolean);
        System.out.println("objetoBoolean2 = " + objetoBoolean2);

        System.out.println("comparando dos objetos boolean: " + (objetoBoolean==objetoBoolean2)); // compara valores, no se comportan igual que los enteros
        System.out.println("comparando dos objetos boolean: " + (objetoBoolean.equals(objetoBoolean2)));
        System.out.println("comparando dos objetos boolean: " + (objetoBoolean==objetoBoolean3));
        System.out.println("comparando dos objetos boolean: " + (objetoBoolean2==objetoBoolean3)); //para las distintas formas
        // de crear el objeto, el resultado es el mimos, pues al no comportarse como Integer, se compara valores, no Instancias.

        Boolean pimBoolean2=objetoBoolean2.booleanValue();//se retorna un primitivo
        System.out.println("pimBoolean2 = " + pimBoolean2);

    }
}
