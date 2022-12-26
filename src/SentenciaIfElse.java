public class SentenciaIfElse {
    public static void main(String[] args) {

        float promedio=5.8f;

        if(promedio>=6.5){
            System.out.println("Excelente promedio: " + promedio);

        }else if(promedio>=6){
            System.out.println("Buen promedio:" + promedio);
        }else if(promedio>=5){
            System.out.println("promedio regular: " + promedio);
        }else if(promedio>=4){
            System.out.println("promedio insuficiente: " + promedio);}
        else {
            System.out.println("reprobado " + promedio);
        }
        System.out.println("Tu promedio es: " + promedio);
        }

        //si hay mas de una liena en if-else es obligatorio usas llaves "{}" si tan solo
        //es una ionstrucción se puede usar sin llaves.
        }

