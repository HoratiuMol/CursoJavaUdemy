public class EjemploClaseMath {
    public static void main(String[] args) {

        int absoluto= Math.abs(-3);
        System.out.println("absoluto = " + absoluto);

        int absoluto2= Math.abs(3);
        System.out.println("absoluto = " + absoluto2);
        
        double max=Math.max(3.5,1.2);
        System.out.println("max = " + max);
        
        double min=Math.min(3.5,1.2);
        System.out.println("min = " + min);
        
        double techo=Math.ceil(3.5); //se redondea hacia arriba
        System.out.println("techo = " + techo);
        
        double suelo=Math.floor(3.5);
        System.out.println("suelo = " + suelo);
        
        long redondeo=Math.round(Math.PI);
        System.out.println("redondeo = " + redondeo);
        
        double exp=Math.exp(1);
        System.out.println("exp = " + exp);

        double log=Math.log(10);
        System.out.println("log = " + log);
        
        double potencia=Math.pow(10,3);
        System.out.println("potencia = " + potencia);
        
        double raiz=Math.sqrt(10);
        System.out.println("cuadrado = " + raiz);
        
        double grados=Math.toDegrees(1.57);
        grados=Math.round(grados);
        System.out.println("convertir a grados = " + grados);
        
        double radianes=Math.toRadians(90.00);
        System.out.println("radianes = " + radianes);

        System.out.println("sin(90) = " + Math.sin(radianes));
        System.out.println("coseno(90) = " + Math.cos(radianes));

        radianes=Math.toRadians(180.00);
        System.out.println("sin(90) = " + Math.sin(radianes));
        System.out.println("coseno(90) = " + Math.cos(radianes));

        radianes=Math.toRadians(00.00);
        System.out.println("sin(90) = " + Math.sin(radianes));
        System.out.println("coseno(90) = " + Math.cos(radianes));
        


    }
}
