package pkg5.ejercicio.pkgswitch;

/**
 *
 * @author David Pérez
 * Por último, para el Switch, deberás crear la variable estacion, y distintos 
 * case para las cuatro estaciones del año. Dependiendo del valor de la variable
 * estacion se deberá mandar un mensaje por consola informando de la estación 
 * en la que está. También habrá que poner un default para cuando el valor de 
 * la variable no sea una estación.
 */
public class EjercicioSwitch {

    public static void main(String[] args) {
        String estacion = "Otoño";
        switch(estacion) {
            case "Verano":
                System.out.println("La estación es: Verano");
                break;
            case "Primavera":
                System.out.println("La estación es: Primavera");
                break;
            case "Otoño":
                System.out.println("La estación es: Otoño");
                break;
            case "Invierno":
                System.out.println("La estación es: Invierno");
                break;
            default:
                System.out.println("La estación ingresada no es correcta");
                break;
        }
    }
    
}
