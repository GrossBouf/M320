import java.util.Arrays;

public class QArray {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int z=3;
        int s=3;
        int inhalt =0;
        char[] buchstabe= {'a','b','c','d','e','f','g','h','i'};
        int[] asciiBuchstabe = new int[buchstabe.length];
        for (int i = 0; i < buchstabe.length; i++) {
            asciiBuchstabe[i] = buchstabe[i];
        }
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
        for (int i = 0; i < buchstabe.length; i++) {
            System.out.println("number:" + asciiBuchstabe[i] + "\n Letter: " + buchstabe[i]);
            System.out.println();
        }
        int x=5;
        int y=5;
        int d=5;
        char[] alph = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int itrvar = 0;
        char [][][] threedarr; //Deklaration
        threedarr = new char[x][y][d]; //Initialisierung
        for (x=0; x<threedarr.length; x++) {
            for (y=0; y<threedarr.length; y++) {
                for(d=0; d<threedarr.length; d++) {
                    threedarr[x][y][d] = alph[itrvar];
                    if(itrvar > 24) itrvar = 0;
                    else itrvar++;
                }
            }
        }
        System.out.print(Arrays.deepToString(threedarr));

    }


    /*
     * Aufgabe1:
     * Füllen Sie das Array mit den Buchstaben "a-i". Hilfe finden Sie in den beiden letzten Print-Zeilen
     * Aufgabe2:
     * Erstellen Sie einen Würfel mit der Kantenlänge 5 (dreidimensionales Array) und füllen Sie ihn mit den Grossbuchstaben beginnend von A.
     * Geben Sie die Ansichtsseite vorne und den Wert des Würfels im Zentrum (Mitte) auf dem Bildschirm aus.
     */
}


