package Composite.com.curso.v3;

//IS-A
public class CompositeMulti implements Component {
    //HAS-A
    Component comDerecho;
    Component comIzquierdo;

    public CompositeMulti(Component comDerecho, Component comIzquierdo) {
        this.comDerecho = comDerecho;
        this.comIzquierdo = comIzquierdo;
    }

    @Override
    public double getValor() {
        return comDerecho.getValor()*comIzquierdo.getValor();
    }
}
