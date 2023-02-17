package bloqueInicializacion;

public class Principal {
    Principal(){
        System.out.println("Pasó por el constructor");
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Principal p=new Principal();
        Principal p2=new Principal();
    }
    {
        System.out.println("Pasó por bloque de inicialización 1");
    }
    {
        System.out.println("Pasó por bloque de inicialización 2");
    }
}