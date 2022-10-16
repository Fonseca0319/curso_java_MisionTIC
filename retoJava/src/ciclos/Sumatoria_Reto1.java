package Ciclos;

/**
 *
 * @author Pedro Fonseca
 */
public class Sumatoria_Reto1 {
    public static void main(String[] args) {
        int arr[] = new int[] {15,27,33,41,11,7};
        int sum = 0;
        
        for (int i = 0; i < arr.length; i++){
            sum+= arr[i];
        }
        System.out.println("La sumatoria de los números es: "+sum);
    }
}
