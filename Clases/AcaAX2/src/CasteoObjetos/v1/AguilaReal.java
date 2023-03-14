package CasteoObjetos.v1;

public class AguilaReal extends Aguila {
    String tipo="Aguila Real";
    @Override
    public void volar(){
        System.out.println("Volar como aguila real");
    }

    void volarAguilaReal(){
        System.out.println("Método volar como aguila real");
    }
}