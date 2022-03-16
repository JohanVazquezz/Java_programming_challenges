//EJERCICIO: PROGRAMA QUE IMPRIMA LAS TABLAS DEL 1 AL 12
//Johan Vazquez

package u1tablasdel1al12;
import java.util.Scanner;

public class U1tablasdel1al12 {

    public static void main(String[] args) {
        Scanner jin = new Scanner(System.in);
        
        int i, j;
        System.out.println("\nTablas de multiplicacion del 1 al 12");
        for (i = 1; i <= 12; i++){
            for (j = 1; j <=10; j++){
                System.out.println(i+ "\t" +j + "\t=\t" + i*j);
            }
            System.out.println("");
        }
    }
}
