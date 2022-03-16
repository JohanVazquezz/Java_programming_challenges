//EJERCICIO: IMPRIMIR LA DIAGONAL DE UNA MATRIZ
package u1diagonalmatriz;
//Johan Vazquez
import java.util.Scanner;


public class U1diagonalmatriz {

    public static void main(String[] args) {
        Scanner jin = new Scanner(System.in);
        
        int m, n, i, j; //"i" indice filas, "j" indice columnas, "m" columnas, "n" filas.
        
        System.out.print("\n matriz m*n \nTeclea el valor de m y n\n\t-->");
        m = jin.nextInt();
        n = jin.nextInt();
        
        int matrix [][] = new int [m][n];
        int diagonal [] = new int [n];
        
        if (m==n) {
            for (i=0; i<m; i++){
                for (j=0; j<n; j++){
                    System.out.print("\nmatrix [" +i+ "][" +j+ "]\t");
                    matrix[i][j] = jin.nextInt();
                }
            }
            
            System.out.println("\nMATRIZ");
            
            for (i = 0; i<m; i++){
                for (j=0; j<n; j++){
                    if(i==j){
                        diagonal[i] = matrix[i][j];
                    }
                    System.out.print("\t" +matrix[i][j]);
                }
                System.out.println("");
            }
            
            System.out.println("DIAGONAL:");
            
            for (i=0; i<n; i++){
                System.out.print(diagonal[i]+ ", ");
            }
            System.out.println("");
        }else{
            System.out.println("TIENE QUE SER UNA MATRIZ CUADRADA PARA TENER DIAGONAL");
        }
    }
}
