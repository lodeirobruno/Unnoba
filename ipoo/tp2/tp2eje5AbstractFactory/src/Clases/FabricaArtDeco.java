package Clases;

public class FabricaArtDeco extends FabricaAbstracta{
    private SillaArtDeco sillaArtDeco;
    private SofaArtDeco sofaArtDeco;
    private MesitaArtDeco mesitaArtDeco;

    public FabricaArtDeco() {

    }

    public FabricaArtDeco(String nombre) {
        super(nombre);
    }

    public SillaArtDeco getSillaArtDeco() {
        return sillaArtDeco;
    }

    public void setSillaArtDeco(SillaArtDeco sillaArtDeco) {
        this.sillaArtDeco = sillaArtDeco;
    }

    public SofaArtDeco getSofaArtDeco() {
        return sofaArtDeco;
    }

    public void setSofaArtDeco(SofaArtDeco sofaArtDeco) {
        this.sofaArtDeco = sofaArtDeco;
    }

    public MesitaArtDeco getMesitaArtDeco() {
        return mesitaArtDeco;
    }

    public void setMesitaArtDeco(MesitaArtDeco mesitaArtDeco) {
        this.mesitaArtDeco = mesitaArtDeco;
    }

    @Override
    public Silla crearSilla() {
        return  new SillaArtDeco();

    }
    public Mesita crearMesita() {
        return  new MesitaArtDeco();
    }
    public Sofa crearSofa() {
        return  new SofaArtDeco();
    }
}
