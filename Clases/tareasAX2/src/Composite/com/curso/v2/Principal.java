package Composite.com.curso.v2;

public class Principal {
    public static void main(String[] args) {
        double a=3.7;
        double b=8.9;

        Component compA=new LeafConstante(a);
        Component compB=new LeafConstante(b);

        Component com01=new CompositeSuma(compA,compB);
        System.out.println(com01.getValor());

        Component compC=new LeafConstante(4.5);
        Component compD=new LeafConstante(2.3);

        Component com02=new CompositeSuma(new CompositeSuma(compA,compC),new CompositeSuma(compB,compD));
        Component com03=new CompositeResta(
                new CompositeSuma(
                        new LeafConstante(2.8),
                        new CompositeResta(
                                new LeafConstante(7.8),
                                new LeafConstante(1.8)
                        )
                ),
                new CompositeResta(
                        new CompositeResta(
                                new LeafConstante(7.8),
                                new CompositeSuma(
                                        new LeafConstante(4.8),
                                        new CompositeSuma(
                                                new LeafConstante(4.8),
                                                new LeafConstante(8.8))
                                )
                        ),
                        new CompositeSuma(
                                new LeafConstante(7.8),
                                new LeafConstante(9.8)
                        )
                ));

        System.out.println("comp 03 "+com03.getValor());
    }
}
