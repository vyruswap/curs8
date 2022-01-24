package curs8;

public class Bicicleta extends Vehicul {

	public Bicicleta() {
		setBrand("Montana");
		setNivelPoluare(0);
		setVitezaMedie(30);
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