package inyeccionDependencias.v5;

public class CompuLinux extends Computadora {
    String version;

    public CompuLinux(String version) {
        this.version = version;
    }

    @Override
    public void encender(){
        System.out.println("se encendió compu Linux");
    }
}
