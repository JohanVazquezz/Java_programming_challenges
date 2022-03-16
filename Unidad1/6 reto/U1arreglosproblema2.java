package u1arreglosproblema2;
//Johan Vazquez
import java.util.Scanner;

public class U1arreglosproblema2 {
    
    public static void imprimirarreglo(int lista[]){
        System.out.println("\t[1]\t[2]\t[3]\t[4]\t[5]\t[6]\t[7]\t[8\t[9]\t[10]\t[11]\t[12]");
        for (int x=1; x < lista.length; x++)
            System.out.print("\t"+lista[x]);
    }
    
    public static void main(String[] args) {
        Scanner jin = new Scanner(System.in);
        int casillas[] = {0,2,3,1,5,7,6,21,7,11,9,0,2};
        int i = 0; 
        
        imprimirarreglo(casillas);

        casillas[11] = casillas[3] + casillas[11];
        System.out.println("\tpaso 1");
        imprimirarreglo(casillas);

        casillas[5] = casillas[1] + casillas[casillas[9]];
        System.out.println("\tpaso 2");
        imprimirarreglo(casillas);

        System.out.println("\tpaso 3");
        imprimirarreglo(casillas);
        
        do{
            casillas[12] = casillas[12] * casillas[12];
            System.out.println("\tpaso 4");
            imprimirarreglo(casillas);
            
            if (casillas[5] == casillas[10]){
                break;
            }else{
                casillas[12] = casillas[12] - 2;
                System.out.println("\tpaso 5");
                imprimirarreglo(casillas);
                casillas[5] = casillas[5] + casillas[2];
                System.out.println("\tpaso 6");
                imprimirarreglo(casillas);
            }
            
        }while(true);
            
        casillas[8] = casillas[7] - casillas[5];
        System.out.println("\tpaso 7");
        imprimirarreglo(casillas);
        casillas[6] = casillas[12] + casillas[8];
        System.out.println("\tpaso 8");
        imprimirarreglo(casillas);
        System.out.println("\nCasilla 6: \t"+casillas[6]);
    }
}