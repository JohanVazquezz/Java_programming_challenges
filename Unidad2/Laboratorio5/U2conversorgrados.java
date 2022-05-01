package u2conversorgrados;

public class U2conversorgrados {
    
    double gradosCel;
    
    U2conversorgrados(){}
    U2conversorgrados(double xgradosCel){
        this.gradosCel = xgradosCel;
    }
    
    void set_gradosCel(double xgradosCel){
        this.gradosCel = xgradosCel;
    }
    
    double get_gradosCel(){
        return this.gradosCel;
    }
    
    double conversor_kelvin(){
        double kelvin;
        kelvin = this.gradosCel + 273.15;
        return kelvin;
    }
    
    double conversor_fahrenheit(){
        double fahrenheit;
        fahrenheit = (((9 * this.gradosCel) / 5) + 32);
        return fahrenheit;
    }
    

}
