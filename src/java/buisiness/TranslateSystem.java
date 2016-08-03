package buisiness;

import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class TranslateSystem {
    int position;

    public String translate(String word, String fromLang, String toLang) throws ParserConfigurationException, SAXException, IOException, XPathExpressionException {
        
        word = word.toLowerCase();
        fromLang = fromLang.toLowerCase();
        toLang = toLang.toLowerCase();
        
        String path = TranslateSystem.class.getResource("dictionary.xml").toString();
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        dbf.setIgnoringElementContentWhitespace(true);
        Document doc = db.parse(path);

        XPathFactory xpf = XPathFactory.newInstance();
        XPath xp = xpf.newXPath();
        XPathExpression xpe = xp.compile("/dictionary/word[" + fromLang + "='" + word + "']"
        );

        switch (toLang) {
            case "english":
                position = 1;
                break;
            case "serbian":
                position = 3;
                break;
            case "german":
                position = 5;
                break;
            case "russian":
                position = 7;
                break;
            case "chinese":
                position = 9;
                break;
        }

        NodeList res = (NodeList) xpe.evaluate(doc, XPathConstants.NODESET);
        try {
            NodeList list = res.item(0).getChildNodes();
            return "Translation from " + fromLang + " to " + toLang + ": " + word + " => " + list.item(position).getTextContent();
        } catch (Exception ex) {
            return "Sorry, there is no such word in dictionary.";
        }
    }
}
