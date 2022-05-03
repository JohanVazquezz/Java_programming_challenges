package u2tarjetadebito;

import java.util.Scanner;

public class soporte {
    public static void main(String[] args){
        Scanner jin = new Scanner(System.in);
        
        U2tarjetadebito tarjeta_debito = new U2tarjetadebito();
        
        String cuenta;
        String cliente;
        String banco;
        double saldo;
        double cantidad;
        double saldo_pos_retiro;
        //double saldo_pos_deposito;
        
        System.out.print("\ndigita el nombre del banco\n\t-->");
        banco = jin.nextLine();
        
        System.out.print("\ndigite el no. de cuenta, nombre suyo"
            + " y su saldo actual\n\t-->");
        cuenta = jin.next();
        cliente = jin.next();
        saldo = jin.nextDouble();
        
        tarjeta_debito.set_num_cuenta(cuenta);
        tarjeta_debito.set_nom_cliente(cliente);
        tarjeta_debito.set_banco(banco);
        tarjeta_debito.set_saldo(saldo);
        
        System.out.println("DATOS:"
            + "\nbanco: " +tarjeta_debito.get_banco()
            + "\nnumero de cuenta: " +tarjeta_debito.get_num_cuenta()
            + "\nnombre del titular: " +tarjeta_debito.get_nom_cliente()
            + "\nsaldo actual: " +tarjeta_debito.get_saldo());
        
        System.out.print("\nDigita si quieres depositar o retirar \n1.deposito \n2.retirar\n\t-->");
        int opc = jin.nextInt();
        
        System.out.println("\n\nTRANSACCIONES");
        
        if(opc == 1){
            U2tarjetadebito saldo_posdeposito = new U2tarjetadebito();
            saldo_posdeposito.set_saldo(saldo);
            System.out.print("\ndeposito -> digita la cantidad\n\t-->");
            cantidad = jin.nextDouble();
            System.out.print("\nsaldo postdeposito: ");
            saldo_posdeposito.deposito(cantidad);
        }else if(opc == 2){
            U2tarjetadebito saldo_posretiro = new U2tarjetadebito();
            saldo_posretiro.set_saldo(saldo);
            System.out.print("\nretiro -> digita la cantidad\n\t-->");
            cantidad = jin.nextDouble();
            System.out.print("\nsaldo postretiro: ");
            saldo_posretiro.retiro(cantidad);
        }
    }
}
