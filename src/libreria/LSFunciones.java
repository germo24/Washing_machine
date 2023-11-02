package libreria;

// Ejemplo de POO de Germo
public class LSFunciones {

    // Declaro las variables necesarias y las encapsulo.
    private int kilos = 0, TipoDeRopa = 0, LlenadoCompleto = 0, LavadoCompleto = 0, SecadoCompleto = 0;

    // Recupero las variables que nos dan desde el programa principal
    public LSFunciones(int kilos, int TipoDeRopa) {
        this.kilos = kilos;
        this.TipoDeRopa = TipoDeRopa;

    }

    private void Llenado() {
        // Esta variable (al igual que todas menos kilos y TipoDeRopa) funciona como un dato booleano, 0 es false (no está lleno) y 1 es true (está lleno).
        if (kilos <= 12) {
            LlenadoCompleto = 1;
            System.out.println(" LLenando... ");
            System.out.println(" LLenado exitoso! ");

        } else {
            LlenadoCompleto = 0;
            System.out.println(" El peso de la ropa excede el peso máximo (12 kilos), reduzca la carga y vuelva a intentar ");

        }

    }

    private void Lavado() {
        Llenado();

        if (LlenadoCompleto == 1) {

            LavadoCompleto = 1;

            switch (TipoDeRopa) {
                case 1:
                    System.out.println(" Se realizará un lavado suave ");
                    break;
                case 2:
                    System.out.println(" Se realizará un lavado intenso ");
                    break;
                default:
                    System.out.println(" La ropa detectada no está disponible, se realizará un lavado intenso ");
                    break;
            }

        } else {

            LavadoCompleto = 0;

        }

    }

    private void Secado() {
        Lavado();
        if (LavadoCompleto == 1) {

            SecadoCompleto = 1;

            System.out.println(" Secando... ");
            System.out.println(" Secado Completo ");
        } else {

            SecadoCompleto = 0;
        }

    }

    public void CicloFinalizado() {
        Secado();
        if (SecadoCompleto == 1) {

            System.out.println(" El lavado ha finalizado correctamente ");

        }

    }

    // Ejemplos de Setter y Getter
    // Getter
    public int getTipoDeRopa() {
        return TipoDeRopa;
    }

    // Setter
    public void setTipoDeRopa(int TipoDeRopa) {
        this.TipoDeRopa = TipoDeRopa;

    }
}
