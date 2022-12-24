package pkg2.clasecoche;

/**
 *
 * @author David Pérez
 * Segunda parte:

Crear una clase coche.

Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.

Una función que incremente el número de puertas que tiene el coche.

Crear un objeto miCoche en el main y añadirle una puerta.

Mostrar el número de puertas que tiene el objeto.
 */
public class ClaseCoche {

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.aumentarPuertas();
        System.out.println(miCoche.puertas);
    }
    
}

class Coche {
    public int puertas = 4;
    public void aumentarPuertas() {
        this.puertas +=1;
    }
}
