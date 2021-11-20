package model;


public class DevizniRacun extends Racun {
	public DevizniRacun(double stanje, double plata) {
		super(stanje, plata);
	}

	public void isplata(double iznos) {
		super.isplata(iznos);
		System.out.println(toString() + "\n"+"eur");
	}

	@Override
	public void uplata(double iznos) {
		super.uplata(iznos);
		System.out.println(toString() + "\n"+"eur");
	}

	@Override
	public String toString() {
		return "Devizni " + super.toString()+"eur";
	}
}
