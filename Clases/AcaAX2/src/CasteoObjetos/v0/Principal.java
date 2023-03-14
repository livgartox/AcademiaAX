package CasteoObjetos.v0;

public class Principal {
    public static void main(String[] args) {
        Ave ave=new AguilaReal();
        System.out.println(ave.tipo);//Ave
        System.out.println(((AguilaReal)ave).tipo);//AguilaReal

        ((AguilaReal) ave).volarAguila();
        ((Aguila) ave).volarAguila();
        

    }

}
