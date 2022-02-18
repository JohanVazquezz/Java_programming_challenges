package u1mayoromenor;
//Johan Vazquez

import java.util.Calendar;
import java.util.Scanner;

public class U1mayoromenor{
    
    public static void main(String[] args){
        Scanner jin = new Scanner(System.in);
        
        System.out.print("\ndigita el año en el que naciste\n\t-->");
        int año_nacimiento = jin.nextInt();
        
        Calendar calendario = Calendar.getInstance();
        int año_actual = calendario.get(Calendar.YEAR);
        int edad = año_actual - año_nacimiento;
        
        if (edad >= 18){
            System.out.println("\nTienes " + edad + " años, eres mayor de edad");
        }else if(edad > 0 && edad < 18){
            System.out.println("\nTienes " + edad + " años, eres menor de edad");
        }else{
            System.out.println("\nAÑO NO VALIDO");
        }
    }
}