
import Clases.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cooperativa cooperativa = new Cooperativa();

        Colectivo colectivo = new Colectivo( "asa", "lala", 100, 20);
        Chofer chofer = new Chofer( colectivo,20, "bruno");

        Colectivo colectivo1 = new Colectivo( "dasdafa", "lala", 50, 30);
        Chofer chofer2 = new Chofer( colectivo1,20, "cido");
        cooperativa.addSocio(chofer);
        cooperativa.addSocio(chofer2);
        System.out.println(cooperativa.realizarViaje(25, 100).getNombre());
        System.out.println(cooperativa.mayorKilometraje().getKm());
    }
}