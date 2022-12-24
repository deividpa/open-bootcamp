package pkg1.ejercicio.pkgif;

/**
 *
 * @author David Pérez
 * Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
 */
public class EjercicioIf {

    public static void main(String[] args) {
        int numeroIf = -10;
        if(numeroIf==0) {
            System.out.println("El número es: 0");
        } else if(numeroIf>0) {
            System.out.println("El número es: positivo");
        } else {
            System.out.println("El número es: negativo");
        }
    }
    
}
