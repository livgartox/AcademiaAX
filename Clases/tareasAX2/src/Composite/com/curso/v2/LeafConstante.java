package Composite.com.curso.v2;

public class LeafConstante implements Component {
    double valor;
    public LeafConstante(double valor){
        this.valor=valor;
    }

    @Override
    public double getValor() {
        return valor;
    }
}
