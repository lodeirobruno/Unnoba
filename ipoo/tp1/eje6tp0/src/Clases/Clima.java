package Clases;

import java.util.Date;

public class Clima {
    private String ciudad;
    private String provincia;
    private String pais;
    private float temperaturaActual;
    private Boolean estaCelcius;
    private float presion;
    private double vientoVelocidad;
    private String vientoDireccion;
    private double humedad;
    private double visibilidad;
    private Date horaUltimaActualizacion;
    public Clima(String ciudad,String provincia,String pais,float temperaturaActual,Boolean estaCelcius,float presion,double vientoVelocidad,String vientoDireccion,double humedad,double visibilidad,Date horaUltimaActualizacion) {
        setCiudad(ciudad);
        setProvincia(provincia);
        setPais(pais);
        setTemperaturaActual(temperaturaActual);
        setEstaCelcius(estaCelcius);
        setPresion(presion);
        setVientoVelocidad(vientoVelocidad);
        setVientoDireccion(vientoDireccion);
        setHumedad(humedad);
        setVisibilidad(visibilidad);
        setHoraUltimaActualizacion(new Date());
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public float getTemperaturaActual() {
        return temperaturaActual;
    }

    public void setTemperaturaActual(float temperaturaActual) {
        this.temperaturaActual = temperaturaActual;
    }

    public Boolean getEstaCelcius() {
        return estaCelcius;
    }

    public void setEstaCelcius(Boolean estaCelcius) {
        this.estaCelcius = estaCelcius;
    }

    public float getPresion() {
        return presion;
    }

    public void setPresion(float presion) {
        this.presion = presion;
    }

    public double getVientoVelocidad() {
        return vientoVelocidad;
    }

    public void setVientoVelocidad(double vientoVelocidad) {
        this.vientoVelocidad = vientoVelocidad;
    }

    public String getVientoDireccion() {
        return vientoDireccion;
    }

    public void setVientoDireccion(String vientoDireccion) {
        this.vientoDireccion = vientoDireccion;
    }

    public double getHumedad() {
        return humedad;
    }

    public void setHumedad(double humedad) {
        this.humedad = humedad;
    }

    public double getVisibilidad() {
        return visibilidad;
    }

    public void setVisibilidad(double visibilidad) {
        this.visibilidad = visibilidad;
    }

    public Date getHoraUltimaActualizacion() {
        return horaUltimaActualizacion;
    }

    public void setHoraUltimaActualizacion(Date horaUltimaActualizacion) {
        this.horaUltimaActualizacion = horaUltimaActualizacion;
    }
}
