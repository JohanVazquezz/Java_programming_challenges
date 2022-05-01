package u2calculadorabasica;

import java.util.Scanner;

public class soporte {
    public static void main(String[] args){
        Scanner jin = new Scanner(System.in);
        
        U2calculadorabasica calculadora = new U2calculadorabasica();
        
        double a,b;
        char operacion;
        
        System.out.print("\nDigita a, la operacion, y luego b."
            + "\nToma en cuenta la siguiente informacion:"
            + "\n'+' -> suma \n'-' -> resta \n'*' -> multiplicacion \n'/' -> division"
            + "\n\t-->");
        a = jin.nextDouble();
        operacion = jin.next().charAt(0);
        b = jin.nextDouble();
        
        calculadora.set_x(a);
        calculadora.set_y(b);
        
        switch(operacion){
            case '+':{
                System.out.println("\nSUMA: " + calculadora.suma());
                break;
            }
            case '-':{
                System.out.println("\nRESTA: " + calculadora.resta());
                break;
            }
            case '*':{
                System.out.println("\nMULTIPLICACION: " + calculadora.multiplicacion());
                break;
            }
            case '/':{
                System.out.println("\nDIVISION: " + calculadora.division());
                break;
            }
        }
    }
}
