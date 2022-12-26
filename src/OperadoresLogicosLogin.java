    import java.util.Scanner;

    public class OperadoresLogicosLogin {
        public static void main(String[] args) {
           /* String[] usernames= new String[3];
            String[] passwords=new String[3];
            usernames[0]= "andres";
            passwords[0]="12345";

            usernames[1] = "admin";
            passwords[1] = "12345";

            usernames[2] = "pepe";
            passwords[2] = "12345";*/

            String[] usernames = {"andres", "admin", "pepe"};
            String[] passwords = {"123", "1234", "12345"};

            Scanner scanner = new Scanner(System.in);

            System.out.println("ingrese el user name");
            String u = scanner.next();

            System.out.println("ingrese la password");
            String p = scanner.next();

            boolean esAutenticado = false;

            for (int i = 0; i < usernames.length; i++) {
/*
                if( (usernames[i].equals(u) && passwords[i].equals(p)))
                {
                    esAutenticado =true;
                break;
                }else {
                }
            }*/
                if (esAutenticado == true) //al ser expresion booleana con "==" es suficiente
                {
                    esAutenticado = (usernames.equals(u) && passwords.equals(p)) ? true : esAutenticado;

                }
           /* if (userName.equals(u) && password.equals(p) ||
                    (userName2.equals(u) && password2.equals(p) ))//no se usa == porque esa  tipo primmitov. userNammme.equals es un operador relacional
            { esAutenticado =true;

            } //por defecto es false, por eso no hace falta "else"
            if(esAutenticado == true) //al ser expresion booleana con "==" es suficiente
            {
                esAutenticado=true;
                System.out.println("Bienvenido Usuario ".concat(u).concat("!") );
            }else{
                System.out.println("No es valida su autentificación ");
            }*/


            }
            String mensaje = esAutenticado ? "Bienvenido ".concat(u).concat("!") : "Username o contraseña incorrecta \n";
            System.out.println("mensaje = " + mensaje);
        }
    }
