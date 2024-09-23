import Clases.Horno;
import Clases.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Create Pan Negro
        PanNegroBuilder panNegroBuilder = new PanNegroBuilder();
        Horno horno = new Horno(panNegroBuilder);

        Pan panNegro = horno.getPan();
        System.out.println(panNegro.toString());  // Output: Pan de tipo: Pan Negro


    }
}