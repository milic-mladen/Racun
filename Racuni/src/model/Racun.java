package model;

public class Racun {

	protected double stanje;
	protected double plata;
	protected double dozvoljeniMinus;

	public Racun(double stanje, double plata) {

		this.stanje = stanje;
		this.plata = plata;
		dozvoljeniMinus = plata * 0.5;
	}

	public void isplata(double iznos) {
		if (stanje >= iznos) {
			stanje -= iznos;
			System.out.println("isplaceno je: " + iznos);
		} else if (stanje >= 0 && (stanje + dozvoljeniMinus) > iznos) {
			dozvoljeniMinus = dozvoljeniMinus - (iznos - stanje);
			stanje = 0;
			System.out.println("isplaceno je: " + iznos);
		} else {// kada nema dovoljno
			System.out.println("Nema dovoljno sredstava na racunu");
		}

	}

	public void uplata(double iznos) {
		double nedostatak = (plata * 0.5) - dozvoljeniMinus;
		if (nedostatak == 0) {
			stanje += iznos;
		}
		else if (iznos - nedostatak > 0) {
			dozvoljeniMinus = plata*0.5;
			stanje+=iznos-nedostatak;
		} 
		else {
			dozvoljeniMinus+=iznos;
		}
		System.out.println("Uplaceno je: " + iznos);
	}

	@Override
	public String toString() {
		return "racun sadrzi sredstava: " + stanje + ",  dozvoljeniMinus: " + dozvoljeniMinus;
	}
	public static boolean proveraUnosa(int n) {
		if (n == 1 || n == 2) {
			return true;
		}
		System.out.println("Niste pravilno odabrali opciju molimo Vas da ponovo odaberete");
		return false;
	}

	public static void stanjaRacuna(Racun[] racuni) {
		for (Racun racun : racuni) {
			System.out.println(racun);
		}
	}
}
