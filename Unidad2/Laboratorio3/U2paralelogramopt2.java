package u2paralelogramopt2;

public class U2paralelogramopt2 {
    
    int apotema,altura,base;

    U2paralelogramopt2(){}
    U2paralelogramopt2(int a, int b, int c){
        this.apotema = a;
        this.altura = b;
        this.base = c;
    }
        
    void set_base(int c){
        this.base = c;
    }

    void set_altura(int b){
        this.altura = b;
    }

    void set_apotema(int a){
        this.apotema = a;
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