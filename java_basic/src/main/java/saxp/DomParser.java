package saxp;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class DomParser {

    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {


        File input = new File("c:\\data\\xml\\example.xml");

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(input);
        System.out.println("Root element " + document.getDocumentElement().getNodeName());

        NodeList children = document.getElementsByTagName("food");
        for (int i = 0; i < children.getLength(); i++) {
            Node node = children.item(i);
            System.out.println(node.getNodeName());
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                System.out.println(element.getElementsByTagName("name").item(0).getTextContent() + " costs "
                        + element.getElementsByTagName("price").item(0).getTextContent() + " and contains "
                        + element.getElementsByTagName("calories").item(0).getTextContent()
                        + " calories. About product:\n" + element.getElementsByTagName("description").item(0).getTextContent());
            }

        }
    }
}
