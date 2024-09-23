package Clases;
import Clases.*;

public class Cliente {
    private FabricaAbstracta fabrica;
    public Cliente(FabricaAbstracta fabrica) {
        setFabrica(fabrica);
    }

    public FabricaAbstracta getFabrica() {
        return fabrica;
    }

    public void setFabrica(FabricaAbstracta fabrica) {
        this.fabrica = fabrica;
    }
    public Sofa getSofa() {
        return getFabrica().crearSofa();
    }
    public Silla getSilla() {
        return getFabrica().crearSilla();
    }
    public Mesita getMesita() {
        return getFabrica().crearMesita();
    }
}
