import Clases.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FabricaModerna fabricaModerna = new FabricaModerna();
        FabricaVictoriana fabricaVictoriana = new FabricaVictoriana();
        FabricaArtDeco fabricaArtDeco = new FabricaArtDeco();

        Cliente cliente = new Cliente(fabricaModerna);
        Cliente cliente2 = new Cliente(fabricaVictoriana);
        Cliente cliente3 = new Cliente(fabricaArtDeco);
        System.out.println(cliente3.getSofa());
        System.out.println(cliente3.getMesita());
        System.out.println(cliente3.getSilla());

        System.out.println(cliente2.getSofa());
        System.out.println(cliente2.getMesita());
        System.out.println(cliente2.getSilla());

        System.out.println(cliente.getSofa());
        System.out.println(cliente.getMesita());
        System.out.println(cliente.getSilla());
    }
}