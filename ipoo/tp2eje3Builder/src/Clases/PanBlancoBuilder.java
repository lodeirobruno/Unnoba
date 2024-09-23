package Clases;

public class PanBlancoBuilder extends PanBuilder{

    public PanBlancoBuilder(){
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
            return new PanBlanco();
        }
        return null;
    }
}
