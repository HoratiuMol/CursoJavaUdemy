import javax.lang.model.SourceVersion;
import java.util.Map;

public class EjemploVariablesDeEntorno {
    public static void main(String[] args) {
        Map<String, String> varEnv = System.getenv();
        System.out.println("Variables de entorno del sistema = " + varEnv);

        System.out.println("Listando variables de entorno del sistema------");
        for(String key: varEnv.keySet()){
            System.out.println("key = " +  varEnv.get(key));
        }

        String usernam= System.getenv("USERNAME");
        System.out.println("usernam = " + usernam);
        
        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String temDir = System.getenv("TEMP");
        System.out.println("temDir = " + temDir);

        String path = System.getenv("Path");
        System.out.println("path = " + path);

        String appEnv = System.getenv("APLICATION_ENV");
        System.out.println("appEnv = " + appEnv);

        String salEnv = System.getenv("SALUDAR_HOLA");
        System.out.println("salEnv = " + salEnv);
    }
}
