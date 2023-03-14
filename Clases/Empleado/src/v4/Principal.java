package v4;
import java.util.Arrays;
import java.util.Comparator;

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
		
		Comparator<Empleado> compEdad=new Comparator<Empleado>(){
			@Override
			public int compare(Empleado o1, Empleado o2) {
				return o1.getEdad()-o2.getEdad();
			}
		};
		
		Arrays.sort(arrayEmpleados,compEdad);
		for(Empleado e: arrayEmpleados) {
			System.out.println(e);
		}
		
		System.out.println("---------- POR SUELDO-------------");
		
		Comparator<Empleado> compsueldo=new Comparator<Empleado>(){
			@Override
			public int compare(Empleado o1, Empleado o2) {
				return (int) (o1.getSueldo()-o2.getSueldo());
			}
		};
		
		Arrays.sort(arrayEmpleados,compsueldo);
		for(Empleado e: arrayEmpleados) {
			System.out.println(e);
		}
		
		System.out.println("---------- POR NOMBRE-------------");
		Comparator<Empleado> compNombre=new Comparator<Empleado>(){
			@Override
			public int compare(Empleado o1, Empleado o2) {
				return o1.getNombre().compareTo(o2.getNombre());
			}
		};
		Arrays.sort(arrayEmpleados,compNombre);
		for(Empleado e: arrayEmpleados) {
			System.out.println(e);
		}
		
		
	
	}
	

}
