package Clases;

public class PanIntegralBuilder extends PanBuilder{
    public PanIntegralBuilder(){
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
            return new PanIntegral();
        }
        return null;
    }
}
