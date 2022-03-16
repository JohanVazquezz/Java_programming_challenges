package u1ecuaciongeneral;
//Johan Vazquez
import java.util.Scanner;

public class U1ecuaciongeneral {
    
    static double calcularD(int a, int b, int c){
        double d = (b * b) - (4 * a * c);
        return d;
    }
    
    static double calcularx1(int a, int b, int c, double d){
        double x1= (-b + Math.sqrt(d)) / (2 * a);
        return x1;
    }
    
    static double calcularx2(int a, int b, int c, double d){
        double x2= (-b - Math.sqrt(d)) / (2 * a);
        return x2;
    }
    
    
    public static void main(String[] args) {
        Scanner jin = new Scanner(System.in);
        
        double x1,x2,d;
        
        System.out.print("\ndigite los valores de a, b y c\n\t-->");
        int a = jin.nextInt();
        int b = jin.nextInt();
        int c = jin.nextInt();
        
        d = calcularD(a,b,c);
                
        if (d < 0){
            System.out.println("RAICES IMAGINARIAS");
        }else if(d==0){
            x1 = -b / (2*a);
            x2 = x1;
        }else{
            x1 = calcularx1 (a,b,c,d);
            x2 = calcularx2 (a,b,c,d);
            System.out.println("\nx1: " +x1+ "\nx2: " +x2);
        }
    }
}
