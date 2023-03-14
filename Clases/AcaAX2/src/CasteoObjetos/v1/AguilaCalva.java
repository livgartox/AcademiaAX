package CasteoObjetos.v1;

public class AguilaCalva extends Aguila {
    String tipo="Aguila Real";
    @Override
    public void volar(){
        System.out.println("Volar como aguila calva");
    }

    void volarAguilaReal(){
        System.out.println("Método volar como aguila calva");
    }
}