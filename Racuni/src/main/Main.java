package main;

import java.util.Scanner;

import model.DevizniRacun;
import model.DinarskiRacun;
import model.Racun;

public class Main {

	public static void main(String[] args) {
		Racun racun1 = new DinarskiRacun(40000, 60000);
		Racun racun2 = new DevizniRacun(5000, 1000);
		Racun racun3 = new DevizniRacun(15000, 1200);
		Racun racun4 = new DevizniRacun(7000, 900);
		Racun racun5 = new DinarskiRacun(120000, 65000);
		Scanner sc1 = new Scanner(System.in);
		int opcija1 = -1;
		while (true) {
			while (true) {
				System.out.println("Odaberite zeljeni racun: \n1.Dinarski racun \n2.Devizni racun");

				if (sc1.hasNextInt()) {
					opcija1 = sc1.nextInt();
				} else {
					sc1.nextLine();
					System.out.println("Niste pravilno izabrali racun. Molimo Vas ponovo odaberite.\n\n\n\n");
					continue;
				}
				if (!Racun.proveraUnosa(opcija1)) {
					continue;
				}
				break;
			}
			if (opcija1 == 1) {
				System.out.println(racun1 + "\n");
			} else {
				System.out.println(racun2 + "\n");
			}
			int opcija2;
			while (true) {

				System.out.println("Odaberite opciju: \n1:Uplata \n2.Isplata");
				if (sc1.hasNextInt()) {
					opcija2 = sc1.nextInt();
				} else {
					sc1.nextLine();
					System.out.println("Niste pravilno izabrali racun. Molimo Vas ponovo odaberite.\n\n\n\n");
					continue;
				}
				if (!Racun.proveraUnosa(opcija1)) {
					continue;
				}
				if (opcija2 == 1) {// Uplata
					System.out.println("Unesite iznos zeljene uplate: ");
					double iznos = sc1.nextDouble();
					if (opcija1 == 1) {
						racun1.uplata(iznos);
					} else {
						racun2.uplata(iznos);
					}
					break;
				} else if (opcija2 == 2) {// isplata
					System.out.println("Unesite iznos zeljene isplate: ");
					double iznos = sc1.nextDouble();
					if (opcija1 == 1) {
						racun1.isplata(iznos);
					} else {
						racun2.isplata(iznos);
					}
					break;

				}
			}
			int opcija3;
			while (true) {
				System.out.println("Nastavi sa koriscenjem: \n1. Da \n2. Ne");
				if (sc1.hasNextInt()) {
					opcija3 = sc1.nextInt();
				} else {
					sc1.nextLine();
					System.out.println("Niste pravilno izabrali racun. Molimo Vas ponovo odaberite.\n\n\n\n");
					continue;

				}
				if (!Racun.proveraUnosa(opcija3)) {
					continue;
				}
				break;
			}
			if (opcija3 == 1) {
				continue;
			}
			String emoji = "👋";
			System.out.println("Hvala sto ste koristi1li nase usluge.  " + emoji);
			break;
		}

		Racun[] racuni = new Racun[5];
		racuni[0] = racun1;
		racuni[1] = racun2;

	}

}
