package CasteoObjetos.v1;

public class Principal {
    public static void main(String[] args) {
        AguilaReal ar=new AguilaReal();

        Aguila aguila=ar;

        Ave ave=aguila;

        Aguila otraAguila=(Aguila)ave;

        Aguila ac=null;

        if(otraAguila instanceof AguilaCalva){
            ac=(AguilaCalva)otraAguila;
        }
        if(otraAguila instanceof AguilaReal){
            ac=(AguilaReal)otraAguila;
        }

        ac.volar();
        

    }

}
