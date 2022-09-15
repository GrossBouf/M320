public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] artikel = {"Messer", "Gabel", "Loeffel"};
		double[] preis = {11.50, 5.50, 4.50};
		double sum = 0;
		int j = 0;
		for (int i = 0; i< artikel.length; i++) {
			System.out.println(artikel[i] + "          " + preis[i]);
			sum+=preis[i];
			j=i;
		}
		System.out.println("Summe:             " + sum);

		/*Aufgabe: Bilden Sie einen Array der Ganzzahlen 1 bis 10.
		 * Geben Sie nur jede zweite Zahl auf dem Bildschirm aus und am Ende die Summe
		 * aller Zahlen des Arrays
		 */
		int[] zahl = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int zahlSumme = 0
		for(int i = 0; i< zahl.length; i + 2) {
			System.out.println(zahl[i])

		}

		for(int i = 0; i< zahl.length; i + 2) {
			sum + zahl[i];
		}
		System.out.println("Summe des Array zahl:" + sum);
		/*
		 * Mit printf kann die Ausgabe formatiert werden.
		 * %ist der Beginn der jeweiligen Formatierung
		 * - heisst linksbündig
		 * 15 Zeichen
		 * acht und zwei Kommastellen für eine floatZahl
		 * n = Newline
		*/

		// Beispiel
		System.out.printf("%-15s %8.2f%n", artikel[j], preis[j]);
	}

}
