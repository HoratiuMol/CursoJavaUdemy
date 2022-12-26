import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {

        //una forma de hacer arreglos
            //String[] nombres= new String [6];
        // otra forma de hacer arreglos
            String[] nombres={"Andres","Pepe","Maria","Paco","Pepa"};
            int count = nombres.length;
            for(int  i=0; i< count;i++) {

                if (nombres[i].equalsIgnoreCase("andres") || nombres[i].equalsIgnoreCase("pepa")){
                    continue;
            }
                System.out.println(i + " ,- " + nombres[i]);
            }
        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"Pepe\" o \"Maria\"");
        System.out.println("buscar = " + buscar);

        boolean encontrado=false;
        for( int i=0; i< count; i++){
            if(nombres[i].equalsIgnoreCase(buscar)){
                encontrado=true;
                break;
            }
        }
        if(encontrado){

            JOptionPane.showMessageDialog(null, buscar + " fuee enconttrado!");
        }else{
            JOptionPane.showMessageDialog(null, buscar + " no existe en el sistetma");
        }
    }
}
