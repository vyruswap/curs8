package curs8;

public class Test {
	
	public static void main(String[] args) {
		
		Vehicul masina = new Masina(); 
		Vehicul bicicleta = new Bicicleta();
		Test test= new Test();
		test.verificaMotorizarea(masina, "diesel", "BMW");
		test.verificaMotorizarea(bicicleta, "manuala", "Pegas");
		masina.detaliiVehicul();
		bicicleta.detaliiVehicul();
		
	}
	
	public void verificaMotorizarea(Vehicul vehicul, String motorizare, String nume) {
		System.out.println("Numele vehiculului este: " + vehicul.nume(nume));
		System.out.println("Motorizarea este de tipul: " + vehicul.motorizare(motorizare));
	}

}