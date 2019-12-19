package com.ua.kashyrin;

import java.io.File;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class WriterXML {
    public static final String xmlFilePath = "/Users/konstantinkasirin/IdeaProjects/ParseXML/xmlfile.xml";

    public static void main(String args[]) {


        ArrayList<Users> users = new ArrayList<>();
        users.add(new Users("A", "Kostya", "234567"));
        users.add(new Users("A", "Kostya", "234567"));
        users.add(new Users("A", "Kostya", "234567"));
        users.add(new Users("A", "Kostya", "234567"));
        users.add(new Users("A", "Kostya", "234567"));


        try {

            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();

            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();

            Document document = documentBuilder.newDocument();

            // root element
            Element root = document.createElement("group");
            document.appendChild(root);

            Element Users = document.createElement("user");
            root.appendChild(Users);

            for (Users usr : users) {

                Element name = document.createElement("Name");
                name.appendChild(document.createTextNode(String.valueOf(usr.getName())));
                Users.appendChild(name);

                Element id = document.createElement("ID");
                id.appendChild(document.createTextNode(String.valueOf(usr.getSurename())));
                Users.appendChild(id);

                Element mmi = document.createElement("Age");
                mmi.appendChild(document.createTextNode(String.valueOf(usr.getPhone())));
                Users.appendChild(mmi);

            }

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);
            StreamResult streamResult = new StreamResult(new File(xmlFilePath));

            transformer.transform(domSource, streamResult);

            System.out.println("Done creating XML File");

        } catch (ParserConfigurationException e) {
            System.out.println(e);
        } catch (TransformerException e) {
            System.out.println(e);
        }
    }
}
