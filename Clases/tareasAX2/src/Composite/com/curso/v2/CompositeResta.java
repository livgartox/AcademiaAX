package Composite.com.curso.v2;

//IS-A
public class CompositeResta implements Component {
    //HAS-A
    Component comDerecho;
    Component comIzquierdo;

    public CompositeResta(Component comDerecho, Component comIzquierdo) {
        this.comDerecho = comDerecho;
        this.comIzquierdo = comIzquierdo;
    }

    @Override
    public double getValor() {
        return comDerecho.getValor()-comIzquierdo.getValor();
    }
}
