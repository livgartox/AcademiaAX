package v8;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

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
		System.out.println("------- con otra cosa ----------------");
		Stream.of(arrayEmpleados)
			.sorted((x,y)->x.getEdad()-y.getEdad())
			.forEach(System.out::println);
			
		System.out.println("------- con clases anonimas ----------------");
		OrdenarEmpleados(arrayEmpleados, (o1,o2)->o1.getEdad()-o2.getEdad());
		
		System.out.println("---------- POR SUELDO-------------");
		
		OrdenarEmpleados(arrayEmpleados, (o1,o2)->(int)(o1.getSueldo()-o2.getSueldo()));
		
		System.out.println("---------- POR NOMBRE-------------");
		OrdenarEmpleados(arrayEmpleados,(o1,o2)->o1.getNombre().compareTo(o2.getNombre()));
	
	}
	
	static void OrdenarEmpleados(Empleado[] arrayEmpleados, Comparator<Empleado> comparatorEmpleado) {
		Arrays.sort(arrayEmpleados,comparatorEmpleado);
		for(Empleado e: arrayEmpleados) {
			System.out.println(e);
		}
	}
}
