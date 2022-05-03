package u2tarjetadebito;

public class U2tarjetadebito {
    String num_cuenta;
    String nom_cliente;
    String banco;
    double saldo;
    double retiro;
    
    U2tarjetadebito(){}
    U2tarjetadebito(String num_cuenta, String nom_cliente, String banco, double saldo){
        this.num_cuenta = num_cuenta;
        this.nom_cliente = nom_cliente;
        this.banco = banco;
        this.saldo = saldo;
    }
    
    void set_num_cuenta(String cuenta){
        this.num_cuenta = cuenta;
    }
    
    void set_nom_cliente(String cliente){
        this.nom_cliente = cliente;
    }
    
    void set_banco(String banco){
        this.banco = banco;
    }
    
    void set_saldo(double saldo){
        this.saldo = saldo;
    }
    
    void set_retiro(double retiro){
        this.retiro = retiro;
    }
    
    String get_num_cuenta(){
        return this.num_cuenta;
    }
    
    String get_nom_cliente(){
        return this.nom_cliente;
    }
    
    String get_banco(){
        return this.banco;
    }
    
    double get_saldo(){
        return this.saldo;
    }
    
    void deposito(double cantidad){
        this.saldo = this.saldo + cantidad;
        System.out.println(this.saldo);
    }
    
    void retiro (double cantidad){
        if (this.saldo >= cantidad){
            this.saldo = this.saldo - cantidad;
            System.out.println(this.saldo);
        }else{
            System.out.println("---Saldo insuficiente--");
        }
    }
}
