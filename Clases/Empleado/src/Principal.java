import java.util.Arrays;

public class Principal {
	public static void main(String[] args) {
		String[] arrayNombres= {
				"Patrobas","Tercio","Andrónico","Epeneto"
		};
		
		Arrays.sort(arrayNombres);
		System.out.println(Arrays.toString(arrayNombres));
		
		System.out.println("----------------");
		
		Empleado[] arrayEmpleados= {
				new Empleado("Patrobas", 30, 567.89),
				new Empleado("Tercio",24 , 1500),
				new Empleado("Andronico",33 , 400),
				new Empleado("Olivia",25, 1400)
		};
		
		Arrays.sort(arrayEmpleados);
		System.out.println(Arrays.toString(arrayEmpleados));
		
		for(Empleado e: arrayEmpleados) {
			System.out.println(e.compareTo(e));
		}
	}
	

}
