package inyeccionDependencias.v0;

public class Becario {
    String nombre;
    //Originalmente estaba como
    //CompuWindows compuWin
    CompuWindows compuWin;
    CompuLinux compuLin;

    public Becario(String nombre) {
        this.nombre = nombre;
    }

    //Aquí compuWin no apunta a ningún objeto
    //cuando le indicamos un comportamiento como en este caso encender
    //se genera el nullPointer
    void encenderComputadora(String tipo){
        System.out.println(nombre);
        if(tipo=="WINDOWS"){
            compuWin=new CompuWindows("Vista");
            compuWin.encender();
        }else{
            compuLin=new CompuLinux("Ubuntu 18");
        }

    }
}
