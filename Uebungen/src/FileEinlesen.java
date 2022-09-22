package uebung;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.*;
import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.Scanner;


public class FileEinlesen {

    public static void main(String[] args) throws IOException {
        String name = "D:/5_daten/Modull 320/uebungen/uebung/in.txt";
        String sokobanlevel = "D:/5_daten/Modull 320/uebungen/uebung/level2.txt";

        FileInputStream ein = new FileInputStream(name);
        int zeichen;
        while ((zeichen = ein.read()) != -1) {  // Die Methode read liest von Beginn an jeweils das folgende Zeichen bis -1 zurückgegeben wird,
            //das das Ende der Datei bedeutet
            System.out.println(zeichen);
        }
        File myObj = new File(name);
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println("line: " + data);
        }

        boolean isCorrect = false;
        String sokobandata = "";
        System.out.println("\n/////////////////////\n Sokoban level \n");
        File sokobanObj = new File(sokobanlevel);
        myReader = new Scanner(sokobanObj);

            while (myReader.hasNextLine()) {
                boolean regcheck = Pattern.matches("^[#$.@ +*\n]*$", sokobandata);
                if(regcheck == true) isCorrect = true;
                else{
                    isCorrect = false;
                    break;
                }
                sokobandata += myReader.nextLine();
            }

        if (isCorrect == true);
        else System.out.println("incorrect");
        ein.close(); // Der Inputstream muss explizit geschlossen werden
        myReader.close();

        char[][] charmatrix = new char[10][10];

        for (int y = 0; y < charmatrix.length; y++) {
            for (int x = 0; x < charmatrix.length; x++) {
                charmatrix[y][x] = sokobandata.charAt(x + (y*charmatrix.length));
            }
        }

        System.out.println(Arrays.deepToString(charmatrix));

        for (int i = 0; i < charmatrix.length; i++) {
            System.out.println(Arrays.toString(charmatrix[i]));
        }

        System.out.println(sokobandata);

    }
}

/* Aufgaben:
 * 1: Was bedeuten die Zahlen 10 und 13 in der Ausgabe? Tipp: Schauen Sie in einer Ascii-Tabelle nach.
 *    10 is lf und 13 ist cr bedutet zeilen umbruch
 * 2: Zeigen Sie die Ausgabe auf dem Bildschirm mit den Zeichen, die tatsächlich in der Datei stehen
 * 3: Lesen Sie die Sokoban-Datei in den Ressourcen zu Thema 2 ein und geben Sie diese auf dem Bildschirm aus..
 * 4: Überprüfen Sie beim Einlesen, ob die Zeichen korrekt für das Spiel sind. Verwenden Sie dazu Regex. Javahilfe im Internet
 * 5. Brechen Sie das Einlesen kontrolliert mit einer Fehlermeldung ab, falls ein Zeichen falsch ist.
 * 6. Lesen Sie die Zeichen in eine Matrix ein, indem Sie zuerst Zeilen und Spalten bestimmen (siehe Übung quadratisches Array)
 */









