package v3;
import java.util.Arrays;

public class Principal {
	public static void main(String[] args) {
		
		Empleado[] arrayEmpleados= {
				new Empleado("Patrobas", 30, 567.89),
				new Empleado("Tercio",24 , 1500),
				new Empleado("Andronico",33 , 400),
				new Empleado("Olivia",25, 1400)
		};
		
		Arrays.sort(arrayEmpleados,new OrdenarEdad());
		for(Empleado e: arrayEmpleados) {
			System.out.println(e);
		}
		
		System.out.println("-----------------------");
		Arrays.sort(arrayEmpleados,new OrdenarSueldoC());
		for(Empleado e: arrayEmpleados) {
			System.out.println(e);
		}
		
		System.out.println("-----------------------");
		Arrays.sort(arrayEmpleados,new OrdenarNombre());
		for(Empleado e: arrayEmpleados) {
			System.out.println(e);
		}
	
	}
	

}
