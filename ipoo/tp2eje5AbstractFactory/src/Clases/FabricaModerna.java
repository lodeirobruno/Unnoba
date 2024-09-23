package Clases;

public class FabricaModerna extends FabricaAbstracta{
    private SillaModerna sillaModerna;
    private MesitaModerna mesitaModerna;
    private SofaModerna sofaModerna;
    public FabricaModerna() {
    }

    public FabricaModerna(String nombre) {
        super(nombre);
    }

    public SillaModerna getSillaModerna() {
        return sillaModerna;
    }

    public void setSillaModerna(SillaModerna sillaModerna) {
        this.sillaModerna = sillaModerna;
    }

    public MesitaModerna getMesitaModerna() {
        return mesitaModerna;
    }

    public void setMesitaModerna(MesitaModerna mesitaModerna) {
        this.mesitaModerna = mesitaModerna;
    }

    public SofaModerna getSofaModerna() {
        return sofaModerna;
    }

    public void setSofaModerna(SofaModerna sofaModerna) {
        this.sofaModerna = sofaModerna;
    }

    public Silla crearSilla() {
        return new SillaModerna();
    }
    public Mesita crearMesita() {
        return new MesitaModerna();
    }
    public Sofa crearSofa() {
        return new SofaModerna();
    }
}
