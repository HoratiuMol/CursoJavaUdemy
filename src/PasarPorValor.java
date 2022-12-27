public class PasarPorValor {
    public static void main(String[] args) {

        Integer i =10; //integer primitva se pasa por valor, no por referencia, es un primitivo no un objeto
        System.out.println("iniciamos el método main con i =  " + i);
        test(i); //metodo(argumento)
        System.out.println("finaliza el método main con el valor de i(se mantiene igual) = " + i);

    }

    public static void test(Integer i) {//void no retorna nada

        System.out.println("iniciamos el método test i= " + i);
        i =35;//al ser void cambia estainstancia, la original se queda igual
        System.out.println("nuevo valor de i = " + i);
    }
}
