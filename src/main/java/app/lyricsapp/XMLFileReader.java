package app.lyricsapp;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XMLFileReader{

    public static void main(String argv[]) {

        try {
            //Obtenir la configuration du sax parser
            SAXParserFactory spfactory = SAXParserFactory.newInstance();
            //Obtenir une instance de l'objet parser
            SAXParser saxParser = spfactory.newSAXParser();

 /*les trois méthodes sont déclarées dans le
 corp du DefaltHandler*/
            DefaultHandler handler = new DefaultHandler() {

                boolean bTrackId = false;
                boolean bLyricChecksum = false;
                boolean bLyricId = false;
                boolean bSongUrl = false;
                boolean bArtistUrl = false;
                boolean bArtist = false;
                boolean bSong = false;
                boolean bSongRank = false;

                /*cette méthode est invoquée à chaque fois que parser rencontre
                une balise ouvrante '<' */
                public void startElement(String uri, String localName,
                                         String qName,Attributes attributes) throws SAXException{

                    if (qName.equalsIgnoreCase("TrackId")) {
                        bTrackId = true;
                    }

                    if (qName.equalsIgnoreCase("LyricChecksum")) {
                        bLyricChecksum = true;
                    }

                    if (qName.equalsIgnoreCase("LyricId")) {
                        bLyricId = true;
                    }

                    if (qName.equalsIgnoreCase("SongUrl")) {
                        bSongUrl = true;
                    }

                    if (qName.equalsIgnoreCase("ArtistUrl")) {
                        bArtistUrl = true;
                    }

                    if (qName.equalsIgnoreCase("Artist")) {
                        bArtist = true;
                    }

                    if (qName.equalsIgnoreCase("Song")) {
                        bSong= true;
                    }

                    if (qName.equalsIgnoreCase("SongRank")) {
                        bSongRank = true;
                    }
                }

                /*cette méthode est invoquée à chaque fois que parser rencontre
                une balise fermante '>' */
                public void endElement(String uri, String localName,
                                       String qName) throws SAXException {

                    if (qName.equalsIgnoreCase("TrackId")) {
                        bTrackId = false;
                    }

                    if (qName.equalsIgnoreCase("LyricChecksum")) {
                        bLyricChecksum = false;
                    }

                    if (qName.equalsIgnoreCase("LyricId")) {
                        bLyricId = false;
                    }

                    if (qName.equalsIgnoreCase("SongUrl")) {
                        bSongUrl = false;
                    }

                    if (qName.equalsIgnoreCase("ArtistUrl")) {
                        bArtistUrl = false;
                    }

                    if (qName.equalsIgnoreCase("Artist")) {
                        bArtist = false;
                    }

                    if (qName.equalsIgnoreCase("Song")) {
                        bSong= false;
                    }

                    if (qName.equalsIgnoreCase("SongRank")) {
                        bSongRank = false;
                    }
                }

                /*imprime les données stockées entre '<' et '>' */
                public void characters(char ch[], int start,
                                       int length) throws SAXException {

                    if (bTrackId) {
                        System.out.println("TrackId : " +
                                new String(ch, start, length));
                        bTrackId = false;
                    }

                    if (bLyricChecksum) {
                        System.out.println("LyricChecksum : " +
                                new String(ch, start, length));
                        bLyricChecksum = false;
                    }

                    if (bLyricId) {
                        System.out.println("LyricId : " +
                                new String(ch, start, length));
                        bLyricId = false;
                    }

                    if (bSongUrl) {
                        System.out.println("SongUrl : " +
                                new String(ch, start, length));
                        bSongUrl = false;
                    }

                    if (bArtistUrl) {
                        System.out.println("ArtistUrl : " +
                                new String(ch, start, length));
                        bArtistUrl = false;
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

            saxParser.parse("/amuhome/b21221604/IdeaProjects/lyricsapp/src/main/resources/app/lyricsapp/view/query1.xml", handler);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}