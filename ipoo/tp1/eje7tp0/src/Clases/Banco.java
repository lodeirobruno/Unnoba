package Clases;
import java.util.Vector;

public class Banco {
    private String nombre;
    private String ubicacion;
    private Vector<Transaccion> transacciones = new Vector<>();
    private Moneda moneda;
    private Vector<Cliente> clientes = new Vector<>();
    public Banco(String nombre, String ubicacion, Vector<Transaccion>transacciones,Moneda moneda, Vector<Cliente> clientes) {
        setNombre(nombre);
        setUbicacion(ubicacion);
        setTransacciones(new Vector<Transaccion>());
        setMoneda(moneda);
        setClientes(new Vector<Cliente>());
    }
    public void addCliente(Cliente cliente) {
        getClientes().add(cliente);
    }
    public void addTransaccion(Transaccion transaccion) {
        getTransacciones().add(transaccion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Vector<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(Vector<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

    public Vector<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Vector<Cliente> clientes) {
        this.clientes = clientes;
    }
    public int totalTransacciones() {
        return getTransacciones().size();
    }
    public double impuestoACobrarDeTransaccion(Transaccion  transaccion) {
        return transaccion.calcularImpuesto();
    }
    public double impuestoACobrar(){
        double impuesto = 0;
        for(Transaccion transaccion : getTransacciones()) {
            impuesto += impuestoACobrarDeTransaccion(transaccion);
        }
        return impuesto;
    }
    public double montoTotalTransacciones(){
        double total = 0;
        for(Transaccion transaccion : getTransacciones()) {
            total += transaccion.conversion();
        }
        return total;
    }
}

