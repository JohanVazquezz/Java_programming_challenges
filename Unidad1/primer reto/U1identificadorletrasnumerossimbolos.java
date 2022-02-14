package u1identificadorletrasnumerossimbolos;

import java.util.Scanner;

public class U1identificadorletrasnumerossimbolos {

    public static void main(String[] args) {
        Scanner jin = new Scanner(System.in);
    
        char x;
        System.out.print("\ndigite una letra, vocal o consonante, numero o simbolo\n\t->");
        x = jin.next().charAt(0);
        
        switch(x){
            case '0':{}
            case '1':{}
            case '2':{}
            case '3':{}
            case '4':{}
            case '5':{}
            case '6':{}
            case '7':{}
            case '8':{}
            case '9':{
                System.out.println("\t **Numero**"); 
                break;
            }
        
            case 'a':{}
            case 'A':{}
            case 'e':{}
            case 'E':{}
            case 'i':{}
            case 'I':{}
            case 'o':{}
            case 'O':{}
            case 'u':{}
            case 'U':{
                System.out.println("\t **Vocal**");
                break;
            } 
            
            case 'b':{}
            case 'B':{}
            case 'c':{}
            case 'C':{}
            case 'd':{}
            case 'D':{}
            case 'f':{}
            case 'F':{}
            case 'g':{}
            case 'G':{}
            case 'h':{}
            case 'H':{}
            case 'j':{}
            case 'J':{}
            case 'k':{}
            case 'K':{}
            case 'l':{}
            case 'L':{}
            case 'm':{}
            case 'M':{}
            case 'n':{}
            case 'N':{}
            case 'ñ':{}
            case 'Ñ':{}
            case 'p':{}
            case 'P':{}
            case 'q':{}
            case 'Q':{}
            case 'r':{}
            case 'R':{}
            case 's':{}
            case 'S':{}
            case 't':{}
            case 'T':{}
            case 'v':{}
            case 'V':{}
            case 'x':{}
            case 'X':{}
            case 'z':{}
            case 'Z':{}
            case 'w':{}
            case 'W':{}
            case 'y':{}
            case 'Y':{
                System.out.println("\t **Consonante**");
                break;
            } 
            
            default:{
                System.out.println("\t **Simbolo**");
                break;
            } 
        }
    }
}