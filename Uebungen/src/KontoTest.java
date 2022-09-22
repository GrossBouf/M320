package uebung;

public class KontoTest {
    public static void main(String[] args) {
        Konto k1=new Konto();
        k1.setKontonummer(9999);

        Konto k2=new Konto();
        k2.setKontonummer(2);

        k2.setSaldo(1000);
        System.out.println(k2.getSaldo());
        k2.zahleAus(1000);
        System.out.println(k2.getSaldo());

        System.out.println(k1.getKontonummer());
        k1.info(); //Aufruf der Methode in Klasse Konto



        /* Aufgabe: Ändern sie die Kontonummer von k1 zu 9999
        und geben Sie diese aus */

        /* Eröffnen Sie ein Konto mit dem Betrag 1000 und zahlen Sie
        Fr 100.- aus */

    }

}
