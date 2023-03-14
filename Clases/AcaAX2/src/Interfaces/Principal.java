package Interfaces;

public class Principal {
    //no se puede meter la variable estática en otro método static
    //para primitivos es una constante, para objetos no
    public static final int x=5;
    //En este escenario no permite cambiar la referencia pero el objeto si puede ser modificado
    //el bjeto se puede cambiar solo si es mutable
    public static final StringBuilder sb=new StringBuilder(" Hello");

    public static final String st=new String("Hi");

    public static void main(String[] args) {
        System.out.println(x);
        //no puedo modificar a la x porque es final
        //x++;

        System.out.println(sb);
        sb.append(" Mundo");
        System.out.println(sb);

        //No puedo hacer esto:
        //sb=new StringBuilder("Otro");

        //st.append(" MUNDO STRING");
        System.out.println(st);

        Predicado.and();

        PredicadoImp pi=new PredicadoImp();
        pi.probar("Funcionará?");

    }
}
