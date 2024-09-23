package Clases;

import java.util.Vector;

public class Cuenta{
    private String nombre;
    private String direccionMail;
    private Vector<Correo> enviados = new Vector<>();
    private Vector<Correo> recibidos = new Vector<>();
    public Cuenta(String nombre, String direccionMail, Vector<Correo> enviados, Vector<Correo> recibidos) {
        setDireccionMail(direccionMail);
        setNombre(nombre);
        setEnviados(new Vector<Correo>());
        setRecibidos(new Vector<Correo>());
    }
    public void addEnviado(Correo correo) {
        getEnviados().add(correo);
    }
    public void addRecibido(Correo correo) {
        getRecibidos().add(correo);
    }
    public int totalRecibidos() {
        return getRecibidos().size();
    }
    public int totalEnviados() {
        return getEnviados().size();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccionMail() {
        return direccionMail;
    }

    public void setDireccionMail(String direccionMail) {
        this.direccionMail = direccionMail;
    }

    public Vector<Correo> getEnviados() {
        return enviados;
    }

    public void setEnviados(Vector<Correo> enviados) {
        this.enviados = enviados;
    }

    public Vector<Correo> getRecibidos() {
        return recibidos;
    }

    public void setRecibidos(Vector<Correo> recibidos) {
        this.recibidos = recibidos;
    }
    public int totalCorreosNoLeidos() {
        int total = 0;
         for (Correo correo : getRecibidos()) {
             if(correo.getLeido() == false){
                 total++;
             }
         }
         return total;
    }
}

