package u2paralelogramo;

import java.util.Scanner;

public class soporte {
    public static void main(String[] args) {
        Scanner jin = new Scanner(System.in);
        
        U2paralelogramo paralelogramo_medidas = new U2paralelogramo();
        
        System.out.print("\ndigita la apotema, la altura y la base en ese mismo orden\n\t-->");
        int a = jin.nextInt();
        int b = jin.nextInt();        
        int c = jin.nextInt();
        
        paralelogramo_medidas.set_apotema(a);
        paralelogramo_medidas.set_altura(b);
        paralelogramo_medidas.set_base(c);
        
        double perimetro = paralelogramo_medidas.perimetro();
        double area = paralelogramo_medidas.area();
        
        System.out.println("\n---PARALELOGRAMO---\naltura: " +b+ "\nbase: " +c+ "\napotema: " +a
            + "\n\nperimetro: " +perimetro+ "\narea: " +area);
    }   
}
