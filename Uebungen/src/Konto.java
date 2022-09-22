      public class Konto {
    private int kontonummer;
    private double saldo;

    // Sie sehen drei Konstruktoren
    Konto(){

    }
    Konto(int kontonummer, double saldo){
        this.kontonummer=kontonummer;
        this.saldo=saldo;
    }

    //Aufgabe: schreiben Sie drei Klassen, die von jedem Konstruktor Gebrauch machen
    //Ein Beispiel ohne Parameter, sehen Sie in KontoTest.java

    //Set und Get-Methoden

    int getKontonummer() {
        return kontonummer;
    }
    void setKontonummer(int nr) {
        kontonummer=nr;
    }

    void info() {
        System.out.println("Kontonummer: " + kontonummer);
    }


    //Aufgabe: Scohreiben Sie auch get-und set-Metoden für saldo

    int getSaldo() {
        return kontonummer;
    }
    void setSaldo(int nr) {
        kontonummer=nr;
    }

    void zahleAus(double betrag) {
        saldo=saldo-betrag;
    }

    //schreiben Sie eine Methode für "einzahlen" und benutzen sie Sie diese im Konto Test

    //Aufgaben: Schreiben Sie in Sokoban get-und SetterMethoden, die ihnen die Postition und den zugehörigen Inhalt liefern.


}

