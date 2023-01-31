package app.lyricsapp.model;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class lirefichierXML {

    public static void main(String argv[]) {

        try {
            //Obtenir la configuration du sax parser
            SAXParserFactory spfactory = SAXParserFactory.newInstance();
            //Obtenir une instance de l'objet parser
            SAXParser saxParser = spfactory.newSAXParser();
 
 /*les trois méthodes sont déclarées dans le
 corp du DefaltHandler*/
            DefaultHandler handler = new DefaultHandler() {

                boolean bLyricId = false;
                boolean bArtist = false;
                boolean bSong = false;
                boolean bSongRank = false;

                /*cette méthode est invoquée à chaque fois que parser rencontre
                une balise ouvrante '<' */
                public void startElement(String uri, String localName,
                                         String qName,Attributes attributes) throws SAXException{

                    if (qName.equalsIgnoreCase("LyricId")) {
                        bLyricId = true;
                    }

                    if (qName.equalsIgnoreCase("Artist")) {
                        bArtist = true;
                    }

                    if (qName.equalsIgnoreCase("Song")) {
                        bSong = true;
                    }

                    if (qName.equalsIgnoreCase("SongRank")) {
                        bSongRank = true;
                    }
                }

                /*cette méthode est invoquée à chaque fois que parser rencontre
                une balise fermante '>' */
                public void endElement(String uri, String localName,
                                       String qName) throws SAXException {

                    if (qName.equalsIgnoreCase("LyricId")) {
                        bLyricId = false;
                    }

                    if (qName.equalsIgnoreCase("Artist")) {
                        bArtist = false;
                    }

                    if (qName.equalsIgnoreCase("Song")) {
                        bSong = false;
                    }

                    if (qName.equalsIgnoreCase("SongRank")) {
                        bSongRank = false;
                    }
                }

                /*imprime les données stockées entre '<' et '>' */
                public void characters(char ch[], int start,
                                       int length) throws SAXException {

                    if (bLyricId) {
                        System.out.println("LyricId : " +
                                new String(ch, start, length));
                        bLyricId = false;
                    }

                    if (bArtist) {
                        System.out.println("Artist : " +
                                new String(ch, start, length));
                        bArtist = false;
                    }

                    if (bSong) {
                        System.out.println("Song : " +
                                new String(ch, start, length));
                        bSong = false;
                    }

                    if (bSongRank) {
                        System.out.println("SongRank : " +
                                new String(ch, start, length));
                        bSongRank = false;
                    }
                }

            };

            saxParser.parse("C:\\Users\\dell\\Desktop\\L2\\S2\\Projet initiation génie logiciel\\equipe_ad_pigl_lyricsapp\\src\\main\\resources\\fichiers xml\\query1.xml", handler);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}