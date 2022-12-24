package funcsuma;

/**
 * @author David Pérez
 * Primera parte:

Crear una función con tres parámetros que sean números que se suman entre sí.

Llamar a la función en el main y darle valores.
 */
public class FuncSuma {

    public static void main(String[] args) {
        int suma = sumar(10, 22, 5);
        System.out.println(suma);
    }
    
    public static int sumar(int a, int b, int c) {
        int resultado = a + b + c;
        return resultado;
    } 
}
