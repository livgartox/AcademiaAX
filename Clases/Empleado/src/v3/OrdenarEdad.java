package v3;

import java.util.Comparator;

public class OrdenarEdad implements Comparator<Empleado>{

	@Override
	public int compare(Empleado o1, Empleado o2) {
		return o1.getEdad()-o2.getEdad();
	}
	

}
