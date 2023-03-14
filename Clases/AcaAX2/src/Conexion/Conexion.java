package Conexion;

public class Conexion {
    String tipoCon;
    static int contador;

    public Conexion(String tipoCon) {
        this.tipoCon = tipoCon;
        contador++;
    }

    public static int getContador() {
        return contador;
    }
}
