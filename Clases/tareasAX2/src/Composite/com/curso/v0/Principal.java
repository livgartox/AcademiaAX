package Composite.com.curso.v0;

public class Principal {
    public static void main(String[] args) {
        double a=3.7;
        double b=8.9;

        Component consA=new LeafConstante(a);
        Component consB=new LeafConstante(b);

        if(a==consA.getValor())
            System.out.println("Son iguales");

        if(b==consB.getValor())
            System.out.println("Son iguales");
    }
}
