package u2formulageneral;

public class U2formulageneral {

    int a,b,c;
        
    U2formulageneral(){}
    U2formulageneral(int a1, int b1, int c1){
        a = a1;
        b = b1;
        c = c1;
    }

    void set_a(int a1){
        a = a1;
    }

    void set_b(int b1){
        b = b1;
    }

    void set_c(int c1){
        c = c1;
    }

    int get_a(){
        return (a);
    }

    int get_b(){
        return (b);
    }

    int get_c(){
        return (c);
    }

    double calcular_d(){
        double d;
        d = (b*b)-(4*a*c);
        return d;
    }

    double calcular_x1(){
        double x1;
        x1 = (-b+Math.sqrt((b*b)- (4*a*c))) / (2*a);
        return x1;
    }

    double calcular_x2(){
        double x2;
        x2 = (-b-Math.sqrt((b*b)- (4*a*c))) / (2*a);
        return x2;
    }

    double calcular_xiguales(){
        double xi;
        xi=-b/(2*a);
        return xi;
    }
}