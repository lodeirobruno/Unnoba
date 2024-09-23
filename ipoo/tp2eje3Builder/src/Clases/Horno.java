package Clases;

import java.util.Objects;

public class Horno {
    private PanBuilder panBuilder;
    public Horno() {}
    public Horno(PanBuilder panBuilder) {
        setPanBuilder(panBuilder);
    }


    public PanBuilder getPanBuilder() {
        return panBuilder;
    }

    public void setPanBuilder(PanBuilder panBuilder) {
        this.panBuilder = panBuilder;
    }
    public Pan getPan(){
        return getPanBuilder().BuildPan();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horno horno = (Horno) o;
        return Objects.equals(panBuilder, horno.panBuilder);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(panBuilder);
    }

    @Override
    public String toString() {
        return "Horno{" +
                "panBuilder=" + panBuilder +
                '}';
    }
}
