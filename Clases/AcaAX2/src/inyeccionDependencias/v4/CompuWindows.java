package inyeccionDependencias.v4;

public class CompuWindows extends Computadora {
    String version;

    public CompuWindows(String version) {
        this.version = version;
    }
    @Override
    public void encender(){
        System.out.println("se encendió compuWindows");
    }
}
