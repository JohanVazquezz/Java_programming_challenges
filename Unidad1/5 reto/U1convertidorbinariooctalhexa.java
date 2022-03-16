//EJERCICIO: CONVERTIDOR DE HEXADECIMAL, BINARIO Y OCTAL.
package u1convertidorbinariooctalhexa;

import java.util.Scanner;

public class U1convertidorbinariooctalhexa {

    public static void main(String[] args) {
        Scanner jin = new Scanner(System.in);
        
        int decimal,residuo,contador,opcion;
        String binario = "";
        String octal = "";
        String hexadecimal = "";
        
        System.out.print("\nIngresa el decimal\n\t-->");
        int decimal_definitivo = jin.nextInt();
        decimal = decimal_definitivo;
        
        //CONVERSOR DE DECIMAL A BINARIO
        decimal = decimal_definitivo;
        do{
            contador = decimal / 2;
            residuo = decimal % 2;
            binario = String.valueOf(residuo) + binario;
            decimal = contador;
        }while(contador != 0);
        System.out.print("\nBinario: " + binario);
                
        //CONVERSOR DE DECIMAL A OCTAL
        decimal = decimal_definitivo;
        do{
            contador = decimal / 8;
            residuo = decimal % 8;
            octal = String.valueOf(residuo) + octal;
            decimal = contador;
        }while(contador != 0);
        System.out.print("\nOctal: " +octal);
                
        //CONVERTIDOR DE DECIMAL A HEXADECIMAL
        decimal = decimal_definitivo;
        do{
            contador = decimal / 16;
            residuo = decimal % 16;
            if(residuo == 10){
                hexadecimal = "A" + hexadecimal;
            }else if (residuo == 11){
                hexadecimal = "B" + hexadecimal;
            }else if(residuo == 12){
                hexadecimal = "C" + hexadecimal;
            }else if(residuo == 13){
                hexadecimal = "D" + hexadecimal;
            }else if(residuo == 14){
                hexadecimal = "E" + hexadecimal;
            }else if(residuo == 15){
                hexadecimal = "F" + hexadecimal;
            }else{
                hexadecimal = String.valueOf(residuo) + hexadecimal;
            }
            decimal = contador;

        }while(contador != 0);
        System.out.println("\nHexadecimal: " + hexadecimal);
    }
}
