package Clases;

public interface FiguraGeometrica {
    public void nombre();
    public void color();
    public void mover(int valor,Direcciones direccion);
    public double calcularArea();

    default void imprimir(){
        System.out.println(nombre() + color() + "area:"calcularArea());
    }
}
