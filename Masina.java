package curs8;

public class Masina extends Vehicul{
	
	public Masina() {
		setBrand("Dacia");
		setNivelPoluare(5); 
		setVitezaMedie(1880); 
	}
	
	@Override
	public String nume(String nume) {
		return nume;
	}
	@Override
	public String motorizare(String motorizare) {
		return motorizare;
	}


}