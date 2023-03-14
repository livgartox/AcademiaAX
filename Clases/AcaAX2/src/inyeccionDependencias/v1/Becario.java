package inyeccionDependencias.v1;

public class Becario {
    String nombre;
    //Originalmente estaba como
    //CompuWindows compuWin
    Computadora computadora;

    public Becario(String nombre) {
        this.nombre = nombre;
    }

    //Aquí compuWin no apunta a ningún objeto
    //cuando le indicamos un comportamiento como en este caso encender
    //se genera el nullPointer
    void encenderComputadora(String tipo){
        System.out.println(nombre);

        computadora.encender();

    }
}
