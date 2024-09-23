package clases;
import java.util.Vector;
public class Contenedores {
    private int numeroIdentificacion;
    private String paisDestino;
    private double pesoMaxCarga;
    private Vector<Productos> productos = new Vector<>();
    public Contenedores(int numeroIdentificacion, String paisDestino, double pesoMaxCarga, Vector<Productos> productos) {
        setNumeroIdentificacion(numeroIdentificacion);
        setPaisDestino(paisDestino);
        setPesoMaxCarga(pesoMaxCarga);
        setProductos(new Vector<Productos>());
    }
    public void addProductos(Productos producto) {
        getProductos().add(producto);
    }

    public Vector<Productos> getProductos() {
        return productos;
    }

    public void setProductos(Vector<Productos> productos) {
        this.productos = productos;
    }

    public int getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(int numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getPaisDestino() {
        return paisDestino;
    }

    public void setPaisDestino(String paisDestino) {
        this.paisDestino = paisDestino;
    }

    public double getPesoMaxCarga() {
        return pesoMaxCarga;
    }

    public void setPesoMaxCarga(double pesoMaxCarga) {
        this.pesoMaxCarga = pesoMaxCarga;
    }
    public double calcularContenedorPeso(){
        double peso = 0;
        for(Productos p : getProductos()){

            peso += p.pesoProducto();
        }
        return peso;
    }
    public double calcularContendorValor(){
        double valor = 0;
        for(Productos p : getProductos()){
            valor += p.valorProducto();
        }
        return valor;
    }
}
