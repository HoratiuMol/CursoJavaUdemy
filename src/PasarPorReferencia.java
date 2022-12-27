public class PasarPorReferencia {
    public static void main(String[] args) {

        int[] edad ={10,11,12}; //integer primitva se pasa por valor, no por referencia, es un primitivo no un objeto

        System.out.println("iniciamos el método main");
        for(int i=0;i<edad.length;i++){
            System.out.println("edad = " + edad[i]);
        }
        System.out.println("Antes de llamar al método test ");
        test(edad); //metodo(argumento) acá le pasamos el parámetro
        System.out.println("despues de llamar al método test");
        for(int i=0;i<edad.length;i++){
            System.out.println("edad = " + edad[i]);
        }
        System.out.println("Finaliza el método main con los datos modificados");

    }

    public static void test(int[] edadArr) {//void no retorna nada

        System.out.println("iniciamos el método test");
        for(int i=0;i<edadArr.length;i++){
            edadArr[i]=edadArr[i] + 20;
        }
        System.out.println("Finaliza el método test ocn los datos cambiados");
    }
}
