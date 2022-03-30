package u2formulageneral;

import java.util.*;
public class AplicacionFormulaSG {

    public static void main(String[] args) {
        Scanner jin = new Scanner(System.in);
        
        U2formulageneral ecuacion1 = new U2formulageneral();
        U2formulageneral ecuacion2 = new U2formulageneral(1,-4,4);
        U2formulageneral ecuacion3 = new U2formulageneral();
        int a1, b1, c1;
        double d1, d2, d3;
        
        System.out.print("\nECUACION1: \ndigita los valores de a, b y c\n\t-->");
        a1 = jin.nextInt();
        b1 = jin.nextInt();
        c1 = jin.nextInt();
        
        ecuacion1.set_a(a1);
        ecuacion1.set_b(b1);
        ecuacion1.set_c(c1);
        
        System.out.println("a: "+ecuacion1.get_a());
        System.out.println("b: "+ecuacion1.get_b());
        System.out.println("c: "+ecuacion1.get_c());
        
        d1 = ecuacion1.calcular_d();
        
        if (d1 >0){
            System.out.println("RESULTADO \nx1: " +ecuacion1.calcular_x1()+ "\nx2: " +ecuacion1.calcular_x2());
        }else if (d1 == 0){
            System.out.println("RESULTADO \nx iguales" + ecuacion1.calcular_xiguales());
        }else{
            System.out.println("RESULTADO \nNumeros imaginarios");
        }
        System.out.println("\n\n");
        
        System.out.print("\nECUACION2: \ndigita los valores de a, b y c\n\t-->");
        a1 = jin.nextInt();
        b1 = jin.nextInt();
        c1 = jin.nextInt();
        
        ecuacion2.set_a(a1);
        ecuacion2.set_b(b1);
        ecuacion2.set_c(c1);
        
        System.out.println("a: "+ecuacion2.get_a());
        System.out.println("b: "+ecuacion2.get_b());
        System.out.println("c: "+ecuacion2.get_c());
        
        d2 = ecuacion2.calcular_d();
        
        if (d2 >0){
            System.out.println("RESULTADO \nx1: " +ecuacion2.calcular_x1()+ "\nx2: " +ecuacion2.calcular_x2());
        }else if (d2 == 0){
            System.out.println("RESULTADO \nx iguales: " + ecuacion2.calcular_xiguales());
        }else{
            System.out.println("RESULTADO \nNumeros imaginarios");
        }
        System.out.println("\n\n");
        
        
        System.out.print("\nECUACION3: \ndigita los valores de a, b y c\n\t-->");
        a1 = jin.nextInt();
        b1 = jin.nextInt();
        c1 = jin.nextInt();
        
        ecuacion3.set_a(a1);
        ecuacion3.set_b(b1);
        ecuacion3.set_c(c1);
        
        System.out.println("a: "+ecuacion3.get_a());
        System.out.println("b: "+ecuacion3.get_b());
        System.out.println("c: "+ecuacion3.get_c());
        
        d3 = ecuacion3.calcular_d();
        
        if (d3 >0){
            System.out.println("RESULTADO \nx1: " +ecuacion3.calcular_x1()+ "\nx2: " +ecuacion3.calcular_x2());
        }else if (d3 == 0){
            System.out.println("RESULTADO \nx iguales" + ecuacion3.calcular_xiguales());
        }else{
            System.out.println("RESULTADO \nNumeros imaginarios");
        }
        System.out.println("\n\n");
       
        
    }
}
