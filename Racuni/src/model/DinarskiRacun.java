package model;

public class DinarskiRacun extends Racun {

	public DinarskiRacun(double stanje, double plata) {
		super(stanje, plata);
	}

	public void isplata(double iznos) {
		super.isplata(iznos);
		System.out.println(toString() );
	}

	@Override
	public void uplata(double iznos) {
		super.uplata(iznos);
		System.out.println(toString() );
	}

	@Override
	public String toString() {
		return "Dinarski " + super.toString()+"din";
	}

}
