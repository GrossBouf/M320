
public class QuadratischesArray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int z=3;
        int s=3;
        int inhalt =0;
        char buchstabe='a';
        int asciiBuchstabe =buchstabe; //automatisches Casting von char nach int
        String [][] arr; //Deklaration
        arr=new String[z][s]; //Initialisierung
        for (z=0; z<arr.length; z++) {
            for (s=0; s<arr.length; s++) {
                arr[z][s]= Integer.toString(inhalt);
                inhalt++;
            }
        }
        for (z=0; z<arr.length; z++) {
            for (s=0; s<arr.length; s++) {
                System.out.print(arr[z][s]);
                inhalt++;
            }
            System.out.println();

        }
        System.out.println(asciiBuchstabe);
        System.out.println((char)(asciiBuchstabe)); //explizites casting von int nach char
    }
    /*
     * Aufgabe1:
     * Füllen Sie das Array mit den Buchstaben "a-i". Hilfe finden Sie in den beiden letzten Print-Zeilen
     * Aufgabe2:
     * Erstellen Sie einen Würfel mit der Kantenlänge 5 (dreidimensionales Array) und füllen Sie ihn mit den Grossbuchstaben beginnend von A.
     * Geben Sie die Ansichtsseite vorne und den Wert des Würfels im Zentrum (Mitte) auf dem Bildschirm aus.
     */
}
