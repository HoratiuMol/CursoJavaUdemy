public class ConversionDeTipos {
    public static void main(String[] args) {
        
        //Conversiópn de un str a cualquier tipo primitivo
        
        String numeroStr = "50";
        
        var numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);
        
        String realStr = "97.45";
        
        var realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);
        
        var logicoStr ="true";
        var logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);
        
        //conversion de un tipo primitivo a cualquier tipo Str
        
        int otroNumeroInt = 7;
        System.out.println("otroNumeroInt = " + otroNumeroInt);
        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        otroNumeroStr = String.valueOf(otroNumeroInt + 10);
        System.out.println("otroNumeroStr = " + otroNumeroStr);
        
        double otroRealDouble = 1.23456;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);
        
        otroRealStr = String.valueOf(1.23456e2f);
        System.out.println("otroRealStr = " + otroRealStr);
        
        int i =32767;
        short s = (short)i; //si supera la longituddel short, la conversión es ambigua, no recomendable
        System.out.println("s = " + s);
        long l =i;
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);
        char b = (char) i;
        System.out.println("b = " + b);
        float f = (float) i;
        System.out.println("f = " + f);

    }
}
