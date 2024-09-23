package Clases;

import java.util.ArrayList;
import java.util.List;

public class GraphEditor {
    private List<FiguraGeometrica> figura= new ArrayList<FiguraGeometrica>();

    public GraphEditor(List<FiguraGeometrica> figura) {
        setFigura(figura);
    }

    public List<FiguraGeometrica> getFigura() {
        return figura;
    }
    public void addFiguraGeometrica(FiguraGeometrica figuraGeometrica) {
        getFigura().add(figuraGeometrica);
    }
    public void deleteFiguraGeometrica(FiguraGeometrica figuraGeometrica) {
        getFigura().remove(figuraGeometrica);
    }

    public void setFigura(List<FiguraGeometrica> figura) {
        this.figura = figura;
    }

    public void mover(int valor,Direcciones direcciones) {
        for(FiguraGeometrica fg: figura){
            fg.mover(valor,direcciones);
        }
    }
    public double calcularAreaTotal(){
        double area = 0;
        for(FiguraGeometrica f: figura){
            area += f.calcularArea();
        }
        return area;
    }
}
