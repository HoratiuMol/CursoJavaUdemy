public class SentenciaBucleEtiquetas {
    public static void main(String[] args) {
        bucle:
        for(int i=0; i<=7;i++){
        int j=0;
            while(j<=8) {
                if (i == 6 || i == 7) {
                    System.out.println("Dia  " + i + ": descanso de fin de semana!");
                    continue bucle;
                }
                System.out.println("Dia " + i + ", trabajando a las " + j + "hrs. ");
                j++;
            }
    }
    etiqueta:
        for(int i=0;i<5;i++){
            System.out.println("\n=============================================");
            for(int j =0;j<5;j++){
                if(i==2){
                    continue etiqueta;
                }
                System.out.println("[i = " + i + ", j = " + j + "]");
            }
        }
    }
}
