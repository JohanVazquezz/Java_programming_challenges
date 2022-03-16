//INSTRUCCION: CREAR U NMETODO QUE AL INGRESAR POR TECLADO UN NUMERO CUALQUIERA 
//MUESTRE LA CANTIDAD DE NUMERSO PARES A PARTIR DEL 2, POR EJEMPLO SI SE 
//INTRODUCE 7, ENTONCES SE IMPRIMIRA 2,4,6,8,10,12,14. INCLUYA LA FUNCION 
//ESCRITA EN UN PROGRAMA QUE FUNCIONE. ASEGURESE QUE SU FUNCION ES LLAMADA 
//DESDE MAIN() DESPLIEGUE EL RESULTADO DEBE SER DENTRO DE LA FUNCION
package u1numerosparescomplejo;
//Johan Vazquez
import java.util.Scanner;

public class U1numerosparescomplejo {
    
    static void numerospares (int cantidad){
        int numeropar=0;
        int auxiliar=1;
        
        while(auxiliar <= cantidad){
            numeropar +=2;
            auxiliar++;
            System.out.print(numeropar+ ", ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner jin = new Scanner(System.in);
        
        System.out.print("\ndigite la cantidad de numeros pares que desea\n\t-->");
        int cantidad = jin.nextInt();
        
        numerospares(cantidad);
    }
}
