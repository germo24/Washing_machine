package lavadorasamsung;

import java.util.Scanner;
import libreria.LSFunciones;

public class Lavadora_uno {

    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        System.out.println(" Ingrese los kilos de ropa que desea lavar: ");
        int kilos = entrada.nextInt();

        System.out.println(" Ingrese el tipo de ropa que desea lavar, siendo: 1 - Ropa blanca / 2 - Ropa de color ");
        int TipoDeRopa = entrada.nextInt();

        LSFunciones mensajero = new LSFunciones(kilos, TipoDeRopa);

// Método setter primero y luego getter
        mensajero.setTipoDeRopa(2);
        System.out.println(" El tipo de ropa es: " + mensajero.getTipoDeRopa());
        mensajero.CicloFinalizado();
    }
}
