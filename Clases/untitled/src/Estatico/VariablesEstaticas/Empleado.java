package Estatico.VariablesEstaticas;

public class Empleado {
    //Atributos, Propiedades

    // de instancia de clase u objeto
    String nombre;
    int contReal;
    //Pertenece a la clase
    static int contador;

    Empleado(String nombre){
        this.nombre=nombre;
        this.contador=contador+1;
        contReal=contador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Empleado.contador = contador;
    }
}
