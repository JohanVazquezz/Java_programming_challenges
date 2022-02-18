package u1añobisiesto;
//Johan Vazquez

import java.util.Scanner;

public class U1añobisiesto{
    
    public static void main (String[] args){
        Scanner jin = new Scanner(System.in);
        
        System.out.print("\nDigita el año\n\t-->");
        int año = jin.nextInt();
        
        if (año % 400 == 0 || año % 4 == 0 && año % 100 !=0){
            System.out.println("\nel año " + año + " es bisiesto: febrero tiene 29 dias");
        }else{
            System.out.println("\nel año " + año + " no es bisiesto: febrero tiene 28 dias");
        }              
    }
}