package inyeccionDependencias.v5;

public class CompuMac extends Computadora {
    String version;

    public CompuMac(String version) {
        this.version = version;
    }

    @Override
    public void encender(){
        System.out.println("se encendió compu MAC");
    }
}
