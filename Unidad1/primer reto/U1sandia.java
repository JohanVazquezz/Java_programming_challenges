package u1sandia;

import java.util.Scanner;
                        
public class U1sandia {
  
    public static void main(String[] args) {
        Scanner jin = new Scanner(System.in);
        System.out.print("\nteclea el peso de la sandia\n\t->");
        int w = jin.nextInt();
        int r = w % 2;
        
        if (w >= 1 && w <= 100 ){
            if(r == 0 && w != 2){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }else{
            System.out.println("PESO FUERA DEL RANGO");
        }
    }
}
