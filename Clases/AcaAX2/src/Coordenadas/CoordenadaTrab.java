package Coordenadas;

public class CoordenadaTrab {
    String nombre;
    Integer posX;
    Integer posY;

    public CoordenadaTrab(String nombre) {
        this.nombre = nombre;
    }

    public static void main(String[] args) {
        CoordenadaTrab c1=new CoordenadaTrab("Patrobas");
        //como posX y posY son wrapper, se inicializan en null
        //si posX y posY fueran int, inicia en 0
        System.out.println(c1.posX);
        System.out.println(c1.posY);
    }
}
