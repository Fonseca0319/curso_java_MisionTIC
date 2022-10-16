

package ciclos;
/**
 *
 * @author Pedro Fonseca
 */
import java.util.Scanner;

public class Promedio {
  
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner aux=new Scanner(System.in);
        int notas;
        float suma;
        float promedio;
        int total_notas = 0;
        
        System.out.println("ingrese el numero de notas tiene: ");
        notas= aux.nextInt();
       
        
        for (int x=1;x<=notas;x++){
            System.out.println("ingrese valor de notas: ");
            suma=aux.nextFloat();
            
            total_notas=(int) (suma+total_notas);
        }
        System.out.println("el valor de la suma es "+total_notas );
        
        promedio=total_notas/notas;
        System.out.println("el promedio es: " +promedio );
        
        
        
    }
    
}