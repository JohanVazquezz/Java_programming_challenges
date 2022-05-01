package u2calculadorabasica;

public class U2calculadorabasica {
    
    double x, y;
    
    U2calculadorabasica(){}
    U2calculadorabasica(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    void set_x(double a){
        x = a;
    }
    
    void set_y(double b){
        y = b;
    }
    
    double suma(){
        double resultado;
        resultado = x+y;
        return resultado;
    }
    
    double resta(){
        double resultado;
        resultado = x-y;
        return resultado;
    }
    
    double multiplicacion(){
        double resultado;
        resultado = x*y;
        return resultado;
    }
    
    double division(){
        double resultado;
        resultado = x/y;
        return resultado;
    }
    
}
