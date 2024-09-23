package Clases;

import java.util.Objects;

public abstract class PanBuilder {
    private boolean comprobarTemperatura;
    private boolean prepararAguaConSal;
    private boolean prepararLevadura;
    private boolean añadirAguaYMezclar;
    private boolean añadirHarinaYRemover;
    private boolean amasar;
    private boolean dejarReposar;
    private boolean cortarMasa;
    private boolean llevarAlHorno;
    public PanBuilder() {
        setComprobarTemperatura(false);
        setPrepararAguaConSal(false);
        setPrepararLevadura(false);
        setAñadirAguaYMezclar(false);
        setAñadirHarinaYRemover(false);
        setAmasar(false);
        setDejarReposar(false);
        setCortarMasa(false);
        setLlevarAlHorno(false);

    }

    public boolean getComprobarTemperatura() {
        return comprobarTemperatura;
    }

    public void setComprobarTemperatura(boolean comprobarTemperatura) {
        this.comprobarTemperatura = comprobarTemperatura;
    }

    public boolean getPrepararAguaConSal() {
        return prepararAguaConSal;
    }

    public void setPrepararAguaConSal(boolean prepararAguaConSal) {
        this.prepararAguaConSal = prepararAguaConSal;
    }

    public boolean getPrepararLevadura() {
        return prepararLevadura;
    }

    public void setPrepararLevadura(boolean prepararLevadura) {
        this.prepararLevadura = prepararLevadura;
    }

    public boolean getAñadirAguaYMezclar() {
        return añadirAguaYMezclar;
    }

    public void setAñadirAguaYMezclar(boolean añadirAguaYMezclar) {
        this.añadirAguaYMezclar = añadirAguaYMezclar;
    }

    public boolean getAñadirHarinaYRemover() {
        return añadirHarinaYRemover;
    }

    public void setAñadirHarinaYRemover(boolean añadirHarinaYRemover) {
        this.añadirHarinaYRemover = añadirHarinaYRemover;
    }

    public boolean getAmasar() {
        return amasar;
    }

    public void setAmasar(boolean amasar) {
        this.amasar = amasar;
    }

    public boolean getDejarReposar() {
        return dejarReposar;
    }

    public void setDejarReposar(boolean dejarReposar) {
        this.dejarReposar = dejarReposar;
    }

    public boolean getCortarMasa() {
        return cortarMasa;
    }

    public void setCortarMasa(boolean cortarMasa) {
        this.cortarMasa = cortarMasa;
    }

    public boolean getLlevarAlHorno() {
        return llevarAlHorno;
    }

    public void setLlevarAlHorno(boolean llevarAlHorno) {
        this.llevarAlHorno = llevarAlHorno;
    }
    public void comprobarTemperatura() {
        setComprobarTemperatura(true);
        System.out.println("comprobando temperatura");
    }
    public void prepararAguaConSal() {
        setPrepararAguaConSal(true);
        System.out.println("preparando agua con sal");

    }
    public void prepararLevadura() {
        setPrepararLevadura(true);
        System.out.println("preparando levadura");
    }
    public void prepararAguaYMezclar() {
        setAñadirAguaYMezclar(true);
        System.out.println("preparando agua y mezclar");
    }
    public void prepararHarinaYRemover() {
        setAñadirHarinaYRemover(true);
        System.out.println("preparando levadura y remover");

    }
    public void prepararMasa() {
        setAmasar(true);
        System.out.println("preparando masa");

    }
    public void prepararReposar() {
        setDejarReposar(true);
        System.out.println("preparando reposar");
    }
    public void llevarAlHorno() {
        setLlevarAlHorno(true);
        System.out.println("llevaral horno");
    }
    public void cortarMasa() {
        setCortarMasa(true);
        System.out.println("cortar masa");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PanBuilder that = (PanBuilder) o;
        return comprobarTemperatura == that.comprobarTemperatura && prepararAguaConSal == that.prepararAguaConSal && prepararLevadura == that.prepararLevadura && añadirAguaYMezclar == that.añadirAguaYMezclar && añadirHarinaYRemover == that.añadirHarinaYRemover && amasar == that.amasar && dejarReposar == that.dejarReposar && cortarMasa == that.cortarMasa && llevarAlHorno == that.llevarAlHorno;
    }

    @Override
    public int hashCode() {
        return Objects.hash(comprobarTemperatura, prepararAguaConSal, prepararLevadura, añadirAguaYMezclar, añadirHarinaYRemover, amasar, dejarReposar, cortarMasa, llevarAlHorno);
    }

    @Override
    public String toString() {
        return "PanBuilder{" +
                "comprobarTemperatura=" + comprobarTemperatura +
                ", prepararAguaConSal=" + prepararAguaConSal +
                ", prepararLevadura=" + prepararLevadura +
                ", añadirAguaYMezclar=" + añadirAguaYMezclar +
                ", añadirHarinaYRemover=" + añadirHarinaYRemover +
                ", amasar=" + amasar +
                ", dejarReposar=" + dejarReposar +
                ", cortarMasa=" + cortarMasa +
                ", llevarAlHorno=" + llevarAlHorno +
                '}';
    }

    public abstract Pan BuildPan();
}
