package clases;

public class Persona {
    private String nombre;
    private int edad;
    public Persona(String nombre, int edad) {
        setNombre(nombre);
        setEdad(edad);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}