package saxp;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class FoodHandler extends DefaultHandler {

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        String name = attributes.getValue("name");
        String price = attributes.getValue("price");
        String calories = attributes.getValue("calories");
        String description = attributes.getValue("description");


        System.out.println("Tag " + qName);
        if (qName.equals("food")) {
            System.out.println(name + " costs " + price + " and contains " + calories + " calories. About product:\n" + description);
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        System.out.println(new String(ch, start, length));
    }
}
