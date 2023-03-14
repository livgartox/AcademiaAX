package inyeccionDependencias.v0;

public class CompuWindows {
    String version;

    public CompuWindows(String version) {
        this.version = version;
    }

    public void encender(){
        System.out.println("se encendió");
    }
}
