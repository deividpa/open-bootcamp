package ejercicioherencia;

/**
 *
 * @author David Pérez
 * 
 * Crea una clase Persona con las siguientes variables:

La edad

El nombre

El teléfono

Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, 
* esta nueva clase tendrá la variable credito solo para esa clase.
* 

Crea ahora un objeto de la clase Cliente que debe tener como propiedades la 
* edad, el telefono, el nombre y el credito, tienes que darles valor y 
* mostrarlas por pantalla.

Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona,
*y con una variable salario que solo tenga la clase Trabajador.
 */
public class EjercicioHerencia {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNombre("David");
        cliente1.setEdad(19);
        cliente1.setTelefono(5555555);
        cliente1.setCredito(200000);
        System.out.println(cliente1.getNombre());
        System.out.println(cliente1.getEdad());
        System.out.println(cliente1.getTelefono());
        System.out.println(cliente1.getCredito());
        
        Trabajador trabajador1 = new Trabajador();
        trabajador1.setEdad(18);
        trabajador1.setNombre("José");
        trabajador1.setTelefono(5556669);
        trabajador1.setSalario(1000000);
        System.out.println(trabajador1.getNombre());
        System.out.println(trabajador1.getEdad());
        System.out.println(trabajador1.getTelefono());
        System.out.println(trabajador1.getSalario());
    }  
    
}

class Persona {
    private int edad, telefono;
    private String nombre;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }
    
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    public int getTelefono() {
        return this.telefono;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return this.nombre;
    }  
}

class Cliente extends Persona {
    private double credito;
    
    public void setCredito(double credito) {
        this.credito = credito;
    }
    
    public double getCredito() {
        return this.credito;
    }
}

class Trabajador extends Persona {
    private float salario;
    
    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public float getSalario() {
        return this.salario;
    }
}
