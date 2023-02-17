package ModAccess;

public class Empleado {
    public String nombre;//Se ve en todos lados hasta la v8
    private int edad;//solo la clase tiene acceso
    String apPaterno;//default
    protected boolean isSingle;//Solo en las clases heredadas
    //debe ser del tipo que se está heredando
}
