package ejerciciopoo;

/**
 *
 * @author David Pérez
 * Para practicar la encapsulación:

- Crear clase Persona.
- Crear variables las privadas edad, nombre y telefono de la clase Persona.
- Crear gets y sets de cada propiedad.
- Crear un objeto persona en el main.
- Utiliza los gets y sets para darle valores a las propiedades edad, nombre y 
* telefono, por último muéstralas por consola.
 */
public class EjercicioPOO {
    public static void main(String[] args) {
        Persona individuo1 = new Persona();
        individuo1.setEdad(22);
        individuo1.setNombre("David Pérez");
        individuo1.setTelefono(314760055);
        System.out.println(individuo1.getEdad() + "\n" + individuo1.getNombre() 
            + "\n" + individuo1.getTelefono());     
    }
}

class Persona {
    private long telefono;
    private int edad;
    private String nombre;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }     
}
