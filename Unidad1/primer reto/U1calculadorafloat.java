package u1calculadorafloat;

import java.util.Scanner;

public class U1calculadorafloat {

    public static void main(String[] args) {
        Scanner jin = new Scanner(System.in);
        
        Float a, b, r;
        String x;
        
        System.out.print("\n---CALCULADORA---\ndigite dos numeros y la operacion"
            + " tomando en cuenta lo siguiente"
            + "\n+. suma"
            + "\n-. resta"
            + "\n*. multiplicacion"
            + "\n/. division"
            + "\n%. modulo"
            + "\n\t->");
        a = jin.nextFloat();
        b = jin.nextFloat();
        x = jin.next();
        
        switch (x.charAt(0)){
            case '+':{
                r = a + b;
                System.out.println("Suma "+r);
                break;
            }
        
            case '-':{
                r = a - b;
                System.out.println("Resta "+r);
                break;
            }
            
            case '*':{
                r = a * b;
                System.out.println("Multiplicacion "+r);
                break;
            }
            
            case '/':{
                r = a / b;
                System.out.println("Division "+r);
                break;
            }
            
            case '%':{
                System.out.println("OPERACION NO VALIDA PARA FLOTANTES");
                break;
            }

            default:{
            System.out.println("SINTAX ERROR");
            break;
            }
        } 
    }
}
