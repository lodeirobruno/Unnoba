package Clases;

public class FabricaVictoriana extends FabricaAbstracta{
    private SofaVectoriana sofa;
    private SillaVictoriana silla;
    private MesitaVectoriana mesita;
    public FabricaVictoriana() {
    }

    public FabricaVictoriana(String nombre) {
        super(nombre);
    }

    public SofaVectoriana getSofa() {
        return sofa;
    }

    public void setSofa(SofaVectoriana sofa) {
        this.sofa = sofa;
    }

    public SillaVictoriana getSilla() {
        return silla;
    }

    public void setSilla(SillaVictoriana silla) {
        this.silla = silla;
    }

    public MesitaVectoriana getMesita() {
        return mesita;
    }

    public void setMesita(MesitaVectoriana mesita) {
        this.mesita = mesita;
    }

    public Silla crearSilla() {
        return new SillaVictoriana();
    }
    public Mesita crearMesita() {
        return new MesitaVectoriana();
    }
    public Sofa crearSofa() {
        return new SofaVectoriana();
    }
}
