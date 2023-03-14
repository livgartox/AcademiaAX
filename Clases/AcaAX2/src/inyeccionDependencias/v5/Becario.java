package inyeccionDependencias.v5;

public class Becario {
    private String nombre;
    //Bajo ACOPLAMIENTO
    private Computadora computadora;

    public Becario(String nombre, Computadora computadora) {
        this.nombre = nombre;
        this.computadora = computadora;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    //Aquí compuWin no apunta a ningún objeto
    //cuando le indicamos un comportamiento como en este caso encender
    //se genera el nullPointer
    void encenderComputadora(){
        System.out.println(nombre);

        computadora.encender();

    }
}
