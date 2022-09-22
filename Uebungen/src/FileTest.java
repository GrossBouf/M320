package uebung;

import java.io.File;
import java.util.Date;


public class FileTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        File file=new File("D:/5_daten/Modull 320/uebungen/uebung/in.txt");
        System.out.println("Name der Datei: " + file.getName());


		/* Aufgabe: das Objekt "file" hat viele Methoden. Testen Sie diese aus und geben Sie das Ergebnis
		auf dem Bildschirm aus */


        // Bei der folgenden Methode muss zur besseren Lesbarkeit, das Datum noch gewandelt werden
        System.out.println("last Modified: " +  file.lastModified());
        System.out.println("date last Modified: " +  new Date (file.lastModified()));
        System.out.println("Free space: " + file.getFreeSpace());
        System.out.println("Usable space: " + file.getUsableSpace());
        System.out.println("can write: " + file.canWrite());

    }

}

