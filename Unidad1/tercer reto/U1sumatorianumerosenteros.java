package u1sumatorianumerosenteros;

import java.util.Scanner;

public class U1sumatorianumerosenteros {

    public static void main(String[] args) {
        Scanner jin = new Scanner(System.in);
        
        System.out.print("digita un numero, si es 0, el programa se "
                + "\ndetendra y sumara los datos previamente dados \n\t-->");
        int x = jin.nextInt();
        int suma = 0;
        
        while(x!=0){
            suma += x;
            System.out.print("digita el siguiente --> ");
            x = jin.nextInt();
        }
        
        System.out.println("\nsumatoria: " + suma);
    }
}
