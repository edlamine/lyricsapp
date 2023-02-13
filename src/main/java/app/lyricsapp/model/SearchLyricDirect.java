package app.lyricsapp.model;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;


public class SearchLyricDirect{
    public static void searchLyricDirect(String artist, String title) throws IOException, ParserConfigurationException, SAXException {
        String TrackId = "0";
        String LyricChecksum = null;
        String LyricId = "0";
        String LyricArtist = null;
        String LyricSong = null;
        String LyricUrl = null;
        String LyricCovertArtUrl = null;
        String LyricCorrectUrl = null ;
        String Lyric =null;
        String LyricRank = String.valueOf(0);

        Document document = null;
        DocumentBuilderFactory factory = null;
        DocumentBuilder builder = null;

        String lien = "http://api.chartlyrics.com/apiv1.asmx/SearchLyricDirect?artist=" + artist + "&song=" + title;


        factory = DocumentBuilderFactory.newInstance();
        builder = factory.newDocumentBuilder();
        document = builder.parse(lien);

        NodeList booksList = document.getElementsByTagName("GetLyricResult");
        Node n = booksList.item(0);
        NodeList v = n.getChildNodes();
        for(int i = 0; i < v.getLength(); i++)
        {
            Node r = v.item(i);
            if (r.getNodeName().equals("TrackId")) TrackId = String.valueOf(Integer.parseInt(r.getTextContent()));
            if (r.getNodeName().equals("LyricChecksum")) LyricChecksum = new String(r.getTextContent());
            if (r.getNodeName().equals("LyricId")) LyricId = String.valueOf(Integer.parseInt(r.getTextContent()));
            if (r.getNodeName().equals("LyricCovertArtUrl")) LyricCovertArtUrl = new String(r.getTextContent());
            if (r.getNodeName().equals("LyricSong")) LyricSong = new String(r.getTextContent());
            if (r.getNodeName().equals("LyricArtist")) LyricArtist = new String(r.getTextContent());
            if (r.getNodeName().equals("LyricUrl")) {LyricUrl = new String(r.getTextContent());}
            if (r.getNodeName().equals("LyricRank")) LyricRank = String.valueOf(Integer.parseInt(r.getTextContent()));
            if (r.getNodeName().equals("LyricCorrectUrl")) LyricCorrectUrl = new String(r.getTextContent());
            if (r.getNodeName().equals("Lyric")) Lyric = new String(r.getTextContent());
        }
        System.out.println(new Lyric( LyricCovertArtUrl, LyricCorrectUrl,Lyric,TrackId,LyricChecksum,LyricId, LyricSong, LyricArtist, LyricUrl,LyricRank));
        System.out.println(v.getLength());
    }
}
