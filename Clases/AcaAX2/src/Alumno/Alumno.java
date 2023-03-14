package Alumno;

public class Alumno {
    {
        System.out.println("bloque inicializacion 1");
    }

    //los bloques estáticos se ejecutaran una sola vez sim importar cuántos objetos creemos
    static {
        System.out.println("bloque estático");
    }
    String nombre;

    Alumno(String nombre){
        System.out.println("Pasó constructor");
        this.nombre=nombre;
    }
    static {
        System.out.println("bloque estático 2");
    }

    {
        System.out.println("bloque inicializacion 2");
    }


}
