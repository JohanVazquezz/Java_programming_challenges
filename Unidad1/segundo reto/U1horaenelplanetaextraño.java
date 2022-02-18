package u1horaenelplanetaextraño;
//Johan Vazquez

import java.util.Scanner;
public class U1horaenelplanetaextraño {
    
    public static void main(String[] args){
        Scanner jin = new Scanner(System.in);
        
        int segundos, minutos=0, horas, dias;
        
        System.out.print("digita la cantidad de segundos:\n\t-->");
        segundos = jin.nextInt();
        
        minutos = segundos / 50;
        segundos = segundos % 50;
        horas = minutos / 70;
        minutos = minutos % 70;
        dias = horas / 12;
        horas = horas % 12;
        
        System.out.println("\nINFORME DEL TIEMPO EN EL EXTRAÑO PLANETA: "
            + "\nDias: " + dias + "\nHoras: " + horas + ""
            + "\nMinutos: " + minutos + "\nsegundos: " + segundos);
        
    }
}
