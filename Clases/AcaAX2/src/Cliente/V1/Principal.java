package Cliente.V1;

import V0.Cliente;

public class Principal {
    public static void main(String[] args) {
        Cliente c1=new Cliente();
        c1.setNombre("Patrobas");
        c1.setSueldo(12000);
        c1.setEdad(-20);

        System.out.println(c1.toString());
    }
}
