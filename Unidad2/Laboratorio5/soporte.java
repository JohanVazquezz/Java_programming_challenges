package u2conversorgrados;

import java.util.Scanner;

public class soporte {
    public static void main(String[] args){
       Scanner jin = new Scanner(System.in);
       
       U2conversorgrados grado = new U2conversorgrados();
       
        System.out.print("\nDigita los grados Celsius para convertir\n\t-->");
        double grados = jin.nextDouble();
        
        grado.set_gradosCel(grados);
        
        System.out.println("\nRESULTADOS"
            + "\nG. celsius: " +grado.get_gradosCel()
            + "\nG. kelvin: " +grado.conversor_kelvin()
            + "\nG. fahrenheit: " +grado.conversor_fahrenheit());
    }
}
