package Clases;

public class PanNegroBuilder extends PanBuilder{
    public PanNegroBuilder(){
        super();
    }
    public Pan BuildPan(){
        prepararAguaConSal();
        prepararLevadura();
        prepararHarinaYRemover();
        prepararMasa();
        prepararAguaYMezclar();
        comprobarTemperatura();
        cortarMasa();
        llevarAlHorno();
        prepararReposar();
        if(getAmasar() && getDejarReposar() && getAñadirHarinaYRemover() && getAñadirAguaYMezclar() && getCortarMasa() && getPrepararAguaConSal() && getLlevarAlHorno() && getPrepararLevadura() && getComprobarTemperatura()){
            return new PanNegro("hola",10);
        }
        return null;
    }
}
