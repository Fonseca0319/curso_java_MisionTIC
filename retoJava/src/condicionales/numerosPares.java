package condicionales;

import java.util.Scanner;
/**
 *
 * @author Pedro Fonseca
 */
public class numerosPares {

    public static void main(String[] args) {
        Scanner aux = new Scanner(System.in);
        int numero;
        System.out.println("ingrese un un numero para saber si es par o impar: ");
        numero = aux.nextInt();
        int resultado = numero % 2;

        if (resultado == 0) {
            System.out.println("el numero " + numero + " es par");
        } else {
            System.out.println("el numero " + numero + " es impar");
        }

    }

}
