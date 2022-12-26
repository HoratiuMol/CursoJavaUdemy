public class PrimitivosFloat {
    public static void main(String[] args) {
        float realFloat =2.12e3f;//==2120;
        System.out.println("realFloat = " + realFloat);
        System.out.println("Tipo byte corresponde en byts a  " + Float.BYTES);
        System.out.println("Tipo byte corresponde en bites a  " + Float.SIZE);
        System.out.println("valor maximo Float= " + Float.MAX_VALUE);
        System.out.println("valor mínimo Float = " + Float.MIN_VALUE);

        double realDouble =1.7976931348623157E308;
        System.out.println("numeroByte = " + realDouble);
        System.out.println("Tipo byte corresponde en byts a  " + Double.BYTES);
        System.out.println("Tipo byte corresponde en bites a  " + Double.SIZE);
        System.out.println("valor maximo Double= " + Double.MAX_VALUE);
        System.out.println("valor mínimo Double = " + Double.MIN_VALUE);

        var varFlotante =3.1316;
        System.out.println("varFlotante = " + varFlotante);
    }
}
