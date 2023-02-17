package gettersSetters;

public class Principal {
    public static void main(String[] args) {
        Alumno a1=new Alumno("Adriana",24,"2017330182");
        a1.setEdad(20);
        System.out.println(a1.getEdad());

    }
}
