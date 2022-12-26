public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Horatiu";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Horatiu\"\") = " + nombre.equals("Horatiu"));
        System.out.println("nombre.equals(\"horatiu\") = " + nombre.equals("horatiu"));
        System.out.println("nombre.equalsIgnoreCase(\"horatiu\") = " + nombre.equalsIgnoreCase("horatiu"));
        System.out.println("nombre.compareTo(\"horatiu\") = " + nombre.compareTo("horatiu"));
        System.out.println("nombre.compareTo(\"horatiu\") = " + nombre.compareTo("Horatiu"));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));

        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1) = " + nombre.substring(1,4));
        System.out.println("nombre.substring(nombre.length()-1) = " + nombre.substring(nombre.length()-1));
        
        
        String trabalenguas = "trabaLenguas";
        System.out.println("trabalenguas.replace(\"a\",\"c\") = " + trabalenguas.replace("a","c"));
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('z')); //puede ser char ('') o string ("")
        System.out.println("trabalenguas.contains(\"a\") = " + trabalenguas.contains("a")); //solo puede ser un string ("")
        System.out.println("trabalenguas.startsWith(\"lenguas\") = " + trabalenguas.startsWith("lenguas"));
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba"));
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas"));
        System.out.println("trabalenguas = ".trim());
    }
}
