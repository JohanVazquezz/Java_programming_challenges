package u2calcularimc;
import java.util.Scanner;

public class soporte {
    public static void main(String[] args){
        Scanner jin = new Scanner(System.in);
        
        U2calcularimc persona = new U2calcularimc();
        
        int identificadorjiji, edadjiji;
        String nombrejiji;
        Double pesojiji, alturajiji, imc;
        
        System.out.print("\nDigita id, nombre, edad, peso y altura.\nEnseguida tendras tu imc\n\t-->");
        identificadorjiji = jin.nextInt();
        nombrejiji = jin.next();
        edadjiji = jin.nextInt();
        pesojiji = jin.nextDouble();
        alturajiji = jin.nextDouble();
        
        persona.set_identificador(identificadorjiji);
        persona.set_nombre(nombrejiji);
        persona.set_edad(edadjiji);
        persona.set_peso(pesojiji);
        persona.set_altura(alturajiji);
        
        System.out.println("DATOS"
            + "\nId: " + persona.get_identificador()
            + "\nnombre: " + persona.get_nombre()
            + "\nedad: " + persona.get_edad()
            + "\npeso: " + persona.get_peso()
            + "\naltura: " + persona.get_altura());
        
        imc = persona.calcula_imc();
        System.out.println("\nIMC: "+ imc);
        
        if(imc < 18.5){
            System.out.println("RE: bajo peso");
        }else if (imc >= 18.5 && imc <=24.9){
            System.out.println("RE: normal");
        }else if (imc >=25.0 && imc <=29.9){
            System.out.println("RE: sobrepreso");
        }else if (imc >= 30){
            System.out.println("Re: obesidad");
        }
    }
}
