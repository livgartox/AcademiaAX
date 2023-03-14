package CasteoObjetos.v0;

public class Aguila implements Ave {
    String tipo="Aguila";
    @Override
    public void volar(){
        System.out.println("Volar como aguila");
    }

    void volarAguila(){
        System.out.println("Método volar como aguila");
    }
}
