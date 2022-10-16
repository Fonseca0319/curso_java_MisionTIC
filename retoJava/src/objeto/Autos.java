package objeto;
/**
 *
 * @author Pedro Fonseca
 */
public class Autos {

    public static void main(String[] args) {
        Automovil auto1;

        auto1 = new Automovil();

        auto1.marca = "Mazda";
        auto1.color = "Rojo";
        auto1.modelo = 2010;
        auto1.cilindraje = "1300 cc";
        auto1.Placa = "GXQ134";
        auto1.funcion1 = "encendido";
        auto1.funcion2 = "arranca en primera";
        auto1.funcion3 = "pitar";
       
        System.out.println(" ");

        auto1.desplegarcaracteristicas();

    }

}
