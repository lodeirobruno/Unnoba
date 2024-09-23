package Clases;

import java.util.Vector;

public class Cliente {
    private Cuenta Cuenta;
    private Vector<Contacto> contactos = new Vector<>();
    public Cliente(Cuenta cuenta, Vector<Contacto> contactos) {
        setCuenta(cuenta);
        setContactos(new Vector<Contacto>());
    }

    public Clases.Cuenta getCuenta() {
        return Cuenta;
    }

    public void setCuenta(Clases.Cuenta cuenta) {
        Cuenta = cuenta;
    }

    public Vector<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(Vector<Contacto> contactos) {
        this.contactos = contactos;
    }
    public int cantidadDeCorreos(){
        return getCuenta().totalEnviados()+ getCuenta().totalRecibidos();
    }
    public int totalCorreosEnviados(){
        return getCuenta().totalEnviados();
    }
    public int totalCorreosRecibidos(){
        return getCuenta().totalRecibidos();
    }
    public int cantidadDeContactos(){
        return getContactos().size();
    }
    public void agregarCorreoRecibido(Correo unCorreo){
        getCuenta().addRecibido(unCorreo);
    }
    public int cantidadCorreosNoLeidos(){
        return getCuenta().totalCorreosNoLeidos();
    }
}
