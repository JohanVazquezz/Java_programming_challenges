package u2calcularimc;

public class U2calcularimc {
    int identificador, edad;
    String nombre;
    double peso, altura;
    
    U2calcularimc(){}

    U2calcularimc(int xidentificador, String xnombre, int xedad, double xpeso, double xaltura){
        this.identificador = xidentificador;
        this.nombre = xnombre;
        this.edad = xedad;
        this.peso = xpeso;
        this.altura = xaltura;
    }
    
    void set_identificador(int identificadorjiji){
        this.identificador = identificadorjiji;
    }
    
    void set_nombre(String nombrejiji){
        this.nombre = nombrejiji;
    }
    
    void set_edad(int edadjiji){
        this.edad = edadjiji;
    }
    
    void set_peso(double pesojiji){
        this.peso = pesojiji;
    }
    
    void set_altura(double alturajiji){
        this.altura = alturajiji;
    }
    
    int get_identificador(){
        return this.identificador;
    }
    
    String get_nombre(){
        return this.nombre;
    }
    
    int get_edad(){
        return this.edad;
    }
    
    double get_peso(){
        return this.peso;
    }
    
    double get_altura(){
        return this.altura;
    }
    
    double calcula_imc(){
        double ximc;
        ximc = peso / (altura * altura);
        return ximc;
    }
}
