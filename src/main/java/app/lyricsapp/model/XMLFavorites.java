package app.lyricsapp.model;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.io.File;

public class XMLFavorites {
    private static final String FILE_NAME = "favorites.xml";
    private static DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
    private static DocumentBuilder dBuilder;
    private static Document doc;

    static {
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(FILE_NAME);
            doc.getDocumentElement().normalize();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void addFavorite(String favorite) {
        Element root = doc.getDocumentElement();
        Element newFavorite = doc.createElement("favorite");
        newFavorite.setTextContent(favorite);
        root.appendChild(newFavorite);
        saveXML();
    }

    public static void removeFavorite(String favorite) {
        Element root = doc.getDocumentElement();
        NodeList favorites = root.getElementsByTagName("favorite");
        for (int i = 0; i < favorites.getLength(); i++) {
            Element favoriteElement = (Element) favorites.item(i);
            if (favoriteElement.getTextContent().equals(favorite)) {
                root.removeChild(favoriteElement);
                saveXML();
                return;
            }
        }
    }

    private static void saveXML() {
        try {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(FILE_NAME));
            transformer.transform(source, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
