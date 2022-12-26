public class OperadoresIncrementales {
    public static void main(String[] args) {

        //PREINCREMENTO
        int i=1;
        System.out.println("inicial de i = " + i);
        int j= ++i; // i= i+1;


        System.out.println("i = " + i);
        System.out.println("j = " + j);


        //POSTINCREMENTO
        i=2;
        System.out.println("inicial de i = " + i);
        j =i++;

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //PREDECREMENTO
        i=3;
        System.out.println("inicial i  = " + i);
        j=--i;

        System.out.println("i = " + i);
        System.out.println("j  = " + j);

        //POSTDECREMENTO
        i=4;
        System.out.println("inicial i = " + i);
        j=i--;

        System.out.println(" i= " +i);
        System.out.println("j = " + j);

        System.out.println("j = " + (++j));
        System.out.println("j = " + (j++));
        System.out.println("j = " + j);
    }
}
