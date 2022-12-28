public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a ="a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();

        for(int i =0; i < 500; i++){
            //c= c.concat(a).concat(b).concat("\n"); //500 => 0 ms
            //c += a + b + "\n"; // 500 => 16 ms
            //sb.append(a) //encadenar métodos //500 => 0 ms
                    //.append(b)
                   // .append("\n");
        }


        System.gc(); // se invoca el garbage collector para liberar espacio System.gc(); para reciclar y limpair estancias

        long fin =System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
    }
}
