package v6;
import java.util.Arrays;

public class Principal {
	public static void main(String[] args) {
		
		Empleado[] arrayEmpleados= {
				new Empleado("Patrobas", 30, 567.89),
				new Empleado("Tercio",24 , 1500),
				new Empleado("Andronico",33 , 400),
				new Empleado("Olivia",25, 1400)
		};
		
		//Arrays.sort(arrayEmpleados,new OrdenarEdad());
		System.out.println("------- POR EDAD ----------------");
		
		Arrays.sort(arrayEmpleados,(o1,o2)->o1.getEdad()-o2.getEdad());
		for(Empleado e: arrayEmpleados) {
			System.out.println(e);
		}
		
		System.out.println("---------- POR SUELDO-------------");
		
		Arrays.sort(arrayEmpleados,(o1,o2)->(int)(o1.getSueldo()-o2.getSueldo()));
		for(Empleado e: arrayEmpleados) {
			System.out.println(e);
		}
		
		System.out.println("---------- POR NOMBRE-------------");
		Arrays.sort(arrayEmpleados,(o1,o2)->o1.getNombre().compareTo(o2.getNombre()));
		for(Empleado e: arrayEmpleados) {
			System.out.println(e);
		}
	
	}
	

}
