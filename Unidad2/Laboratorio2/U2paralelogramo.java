package u2paralelogramo;

public class U2paralelogramo {
    
    int apotema,altura,base;

    U2paralelogramo(){}
    U2paralelogramo(int a, int b, int c){
        apotema = a;
        altura = b;
        base = c;
    }
        
    void set_base(int c){
        base = c;
    }

    void set_altura(int b){
        altura = b;
    }

    void set_apotema(int a){
        apotema = a;
    }

    int get_base(){
        return (base);
    }

    int get_altura(){
        return (altura);
    }

    int get_apotema(){
        return (apotema);
    }

    double area(){
        int area = base * altura;
        return area;
    }
    
    double perimetro(){
        int perimetro = 2 * (base + apotema);
        return perimetro;
    }
}
