package Clases;

import java.util.Objects;

public class Pan {
    private String tipoHarina;
    private int porcentajeGrano;
    public Pan(){

    }
    public Pan(String tipoHarina, int porcentajeGrano) {
        setTipoHarina(tipoHarina);
        setPorcentajeGrano(porcentajeGrano);
    }

    public String getTipoHarina() {
        return tipoHarina;
    }

    public void setTipoHarina(String tipoHarina) {
        this.tipoHarina = tipoHarina;
    }

    public int getPorcentajeGrano() {
        return porcentajeGrano;
    }

    public void setPorcentajeGrano(int porcentajeGrano) {
        this.porcentajeGrano = porcentajeGrano;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pan pan = (Pan) o;
        return porcentajeGrano == pan.porcentajeGrano && Objects.equals(tipoHarina, pan.tipoHarina);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipoHarina, porcentajeGrano);
    }

    @Override
    public String toString() {
        return "Pan{" +
                "tipoHarina='" + tipoHarina + '\'' +
                ", porcentajeGrano=" + porcentajeGrano +
                '}';
    }
}
