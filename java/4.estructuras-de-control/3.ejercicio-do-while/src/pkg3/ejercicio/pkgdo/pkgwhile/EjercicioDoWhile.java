package pkg3.ejercicio.pkgdo.pkgwhile;

/**
 *
 * @author David Pérez
 * Para el bucle Do While, deberás crear la misma estructura que en el While, 
 * pero solo se debe ejecutar una vez.
 */
public class EjercicioDoWhile {

    public static void main(String[] args) {
        int numeroDoWhile = 10;
        do {
            numeroDoWhile+=1;
            System.out.println(numeroDoWhile);
        } while(numeroDoWhile<3);
    }
    
}
