

package secuenciales;
/**
 *
 * @author Pedro Fonseca
 */
import java.util.Scanner;


public class operacionesMmatematicas {

 
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner aux = new Scanner(System.in);
        int num1=0;
        int num2=0,resultado=0;
        
        System.out.println("ingrese numreo  1: ");
        num1= aux.nextInt();
        System.out.println("ingrese numero 2: ");
        num2=aux.nextInt();
        
        int resultado1 = num1+num2;
        int resultado2 = num1-num2;
        int resultado3 = num1*num2;
        int resultado4 = num1/num2;       
        System.out.println("el resultado de la suma es : "+resultado1);
        System.out.println("el resultado de la resta es : "+resultado2);
        System.out.println("el resultado la multiplicacion es : "+resultado3);
        System.out.println("el resultado de la division es : "+resultado4);
        
    }
    
}