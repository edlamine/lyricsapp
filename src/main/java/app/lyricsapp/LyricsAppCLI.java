package app.lyricsapp;

import app.lyricsapp.model.SearchLyricDirect;
import app.lyricsapp.model.SearchLyricText;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Scanner;

public class LyricsAppCLI {
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException, IOException, ParserConfigurationException, SAXException {
        System.out.println("Welcome to the lyrics app");
        while (true) {
            System.out.println("Input your command: ");
            System.out.println("Menu: \n" + "Recherche de chansons: \n" + "1/ Par Artiste et par Titre \n" + "2/ Par Paroles \n" + "0/ Pour quitter");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            if (input.equals("1")) {
                System.out.println("Veuillez entrer le nom de l'artiste \n");
                Scanner scanner1 = new Scanner(System.in);
                String artist = scanner1.nextLine();
                System.out.println("Veuillez entrer le titre de votre chanson \n");
                Scanner scanner2 = new Scanner(System.in);
                String titre = scanner2.nextLine();
                //SearchLyricDirect.searchLyricDirect(artist, titre);
                SearchLyricDirect.searchLyricDirect(artist,titre);
            }

            if (input.equals("2")) {
                System.out.println("Veuillez entrer vos paroles \n");
                Scanner scanner3 = new Scanner(System.in);
                String paroles = scanner3.nextLine();
                String lyrics = paroles;
                SearchLyricText.searchLyricText(lyrics);
            }

            if (input.equals("0")) {
                break;
            }
        }
    }
}
