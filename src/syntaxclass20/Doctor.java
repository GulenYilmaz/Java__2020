package syntaxclass20;

public class Doctor {

	int doctorId;
	String name;

	public Doctor(String name, int doctorId) {
		this.name = name;
		this.doctorId = doctorId;
	}
}

class Dentist extends Doctor {
	
	Dentist(String name, int doctorId) {
		// compiler will try to make call to parent class constructor super();
		super(name, doctorId);
	}
}