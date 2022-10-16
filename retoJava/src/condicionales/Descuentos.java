/**
 *
 * @author Pedro Fonseca
 */
package condicionales;

import java.util.Scanner;


public class Descuentos {


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner aux= new Scanner(System.in);
        String producto="";
        int descuento=0;
        int valor=0,total=0;
        
        System.out.println("en esta tiemda dependo de su compra su descuento ");
        System.out.println("si el valor de su compra mayor a 5000 obtendra 10% de descuento");
        
        System.out.println("nombre de producto;");
        producto= aux.nextLine();
        System.out.println("ingrese el valor de producto; ");
        valor=aux.nextInt();
        
        
        
        if(valor >=5000){
            descuento=valor*10/100;
            total= valor-descuento;
            System.out.println("tiene descuento del 10% ");
            System.out.println("el valor de  "+producto+" es : "+total);
            System.out.println("te ahorras un total de: " + (valor - total));
        }else{
            System.out.println("no tiene descuento ");
            System.out.println("el valor de  "+producto+" es : "+valor);
        }
 
        
        
      
        
    }
    
}