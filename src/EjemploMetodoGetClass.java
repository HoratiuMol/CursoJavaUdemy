import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {
        
        String texto="Hola que tal?";
        
        Class strClass=texto.getClass();
        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass = " + strClass.getSimpleName());
        System.out.println("strClass.getPackageName() = " + strClass.getPackageName());
        System.out.println("strClass = " + strClass);

        for(Method metodo: strClass.getMethods()){
            System.out.println("metodo.= " + metodo.getName());
        }

        Integer num = 34;
        Class intClass = num.getClass();
        System.out.println("intClass = " + intClass.getName());
        System.out.println("intClass = " + intClass.getSimpleName());
        
        Integer num2=34;
        Class intClass2= num.getClass();
        Class objClass = intClass2.getSuperclass().getSuperclass();
        System.out.println("intClass.getSuperclass() = " + intClass2.getSuperclass());
        System.out.println("intClass.getSuperclass() = " + intClass2.getSuperclass().getSuperclass());

        for(Method metodo: objClass.getMethods()){
            System.out.println("metodo.getName = " + metodo.getName());

        }
    }
}
