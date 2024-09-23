package Clases;

public class Correo {
    private String asunto;
    private String texto;
    private Contacto origen;
    private Contacto destino;
    private Boolean leido;
    public Correo(String asunto, String texto, Contacto origen, Contacto destino, Boolean leido) {
        setAsunto(asunto);
        setTexto(texto);
        setOrigen(origen);
        setDestino(destino);
        setLeido(leido);
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Contacto getOrigen() {
        return origen;
    }

    public void setOrigen(Contacto origen) {
        this.origen = origen;
    }

    public Contacto getDestino() {
        return destino;
    }

    public void setDestino(Contacto destino) {
        this.destino = destino;
    }

    public Boolean getLeido() {
        return leido;
    }

    public void setLeido(Boolean leido) {
        this.leido = leido;
    }
}
