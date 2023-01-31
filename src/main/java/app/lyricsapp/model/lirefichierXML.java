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

                boolean bnom = false;
                boolean bprenom = false;
                boolean bmobile = false;
                boolean bemail = false;

                /*cette méthode est invoquée à chaque fois que parser rencontre
                une balise ouvrante '<' */
                public void startElement(String uri, String localName,
                                         String qName,Attributes attributes) throws SAXException{

                    if (qName.equalsIgnoreCase("LyricId")) {
                        bnom = true;
                    }

                    if (qName.equalsIgnoreCase("Artist")) {
                        bprenom = true;
                    }

                    if (qName.equalsIgnoreCase("Song")) {
                        bmobile = true;
                    }

                    if (qName.equalsIgnoreCase("SongRank")) {
                        bemail = true;
                    }
                }

                /*cette méthode est invoquée à chaque fois que parser rencontre
                une balise fermante '>' */
                public void endElement(String uri, String localName,
                                       String qName) throws SAXException {

                    if (qName.equalsIgnoreCase("LyricId")) {
                        bnom = false;
                    }

                    if (qName.equalsIgnoreCase("Artist")) {
                        bprenom = false;
                    }

                    if (qName.equalsIgnoreCase("Song")) {
                        bmobile = false;
                    }

                    if (qName.equalsIgnoreCase("SongRank")) {
                        bemail = false;
                    }
                }

                /*imprime les données stockées entre '<' et '>' */
                public void characters(char ch[], int start,
                                       int length) throws SAXException {

                    if (bnom) {
                        System.out.println("LyricId : " +
                                new String(ch, start, length));
                        bnom = false;
                    }

                    if (bprenom) {
                        System.out.println("Artist : " +
                                new String(ch, start, length));
                        bprenom = false;
                    }

                    if (bmobile) {
                        System.out.println("Song : " +
                                new String(ch, start, length));
                        bmobile = false;
                    }

                    if (bemail) {
                        System.out.println("SongRank : " +
                                new String(ch, start, length));
                        bemail = false;
                    }
                }

            };

            saxParser.parse("query1.xml", handler);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}