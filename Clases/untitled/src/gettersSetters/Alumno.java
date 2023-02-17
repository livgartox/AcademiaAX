package gettersSetters;

public class Alumno {
    private String nombre;
    private int edad;
    private String matricula;

    public Alumno(String nombre, int edad, String matricula) {
        this.nombre = nombre;
        this.edad = edad;
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad<0){
            edad=0;
        }
        this.edad = edad;

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricular(String matricula) {
        this.matricula = matricula;
    }
}
