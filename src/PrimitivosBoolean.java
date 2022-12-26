public class PrimitivosBoolean {
    public static void main(String[] args) {
        boolean prueba = Boolean.FALSE; //(ctrl+ click sobre FALSE)
        boolean datoLogico=true;
        System.out.println("datoLogico = " + datoLogico);

        double d =9876.43e-3;//su valor será 9.876543
        System.out.println("d = " + d);
        float f=1.2345e2f;//su valor será 123.45
        System.out.println("f = " + f);

        datoLogico = (d < f);
        System.out.println("datoLogico = " + datoLogico);
        
        boolean esIgual = (3-2==1);// "==" es comparación "=" es asiganción
        System.out.println("esIgual = " + esIgual);


    }
}
