package clases;

import java.util.Vector;

public class Empresa {
    private String nombre;
    private String direccion;
    private Vector<Contenedores> contenedores = new Vector<>();
    public Empresa(String nombre, String direccion, Vector<Contenedores> contenedores) {
        setContenedores(new Vector<Contenedores>());
        setNombre(nombre);
        setDireccion(direccion);

    }
    public void addContenedor(Contenedores contenedor) {
        getContenedores().add(contenedor);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Vector<Contenedores> getContenedores() {
        return contenedores;
    }

    public void setContenedores(Vector<Contenedores> contenedores) {
        this.contenedores = contenedores;
    }
    public double pesoArticulo(Productos producto) {
        return producto.valorProducto();
    }
    public double pesoContenedor(Contenedores contenedor) {
        return contenedor.calcularContenedorPeso();
    }
    public double valorDeLosArticulos(Contenedores contenedor) {
        return contenedor.calcularContendorValor();
    }
    public double valorDeTodosLosArticulos(){
        double suma = 0;
        for(Contenedores contenedor : getContenedores()) {
            suma+= contenedor.calcularContendorValor();
        }
        return suma;
    }
}
