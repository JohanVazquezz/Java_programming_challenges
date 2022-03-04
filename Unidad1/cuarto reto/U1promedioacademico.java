//EJERCICIO: PROGRAMA QUE PIDA EL NUMERO DE MATERIAS Y DEVUELVA EL PROMEDIO DE LAS CALIFACIONES
//Johan Vazquez 

package u1promedioacademico;
import java.util.Scanner;

public class U1promedioacademico {

    public static void main(String[] args) {
        Scanner jin = new Scanner(System.in);
        
        int i = 0, n = 0;
        double suma = 0, promedio;
        System.out.print("\nTeclea el numero de materias\n\t-->");
        n = jin.nextInt();
        double calificaciones[] = new double[n];
        
        for (i = 0; i < n; i++){
            System.out.print("\nDigita la calificacion una por una\n\t-->");
            calificaciones[i] = jin.nextDouble();
        }
        
        for (i = 0; i < n; i++){
            System.out.println("\ncalificaciones: " +calificaciones[i]);
            suma += calificaciones[i];
        }
        
        promedio = suma / n;
        System.out.println("\n\nSumatoria: " +suma+ "\nPromedio: " +promedio);
    }
}
