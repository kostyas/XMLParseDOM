package com.ua.kashyrin;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ParserXML {

    public static final String XML_PATH = "/Users/konstantinkasirin/IdeaProjects/ParseXML/menu.xml";

    public static void main(String[] args) {

        try {

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document document = builder.parse(new File(XML_PATH));

            List<MenuRestaraunt> menuRestarauntList = new ArrayList<MenuRestaraunt>();
            NodeList nodeList = document.getDocumentElement().getChildNodes();
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element elem = (Element) node;

                    String name = elem.getElementsByTagName("name").item(0).getChildNodes().item(0).getNodeValue();
                    String price = elem.getElementsByTagName("name").item(0).getChildNodes().item(0).getNodeValue();
                    String description = elem.getElementsByTagName("description").item(0).getChildNodes().item(0).getNodeValue();
                    Integer calories = Integer.parseInt(elem.getElementsByTagName("calories").item(0).getChildNodes().item(0).getNodeValue());

                    menuRestarauntList.add(new MenuRestaraunt(name, price, description, calories));
                }
            }

            for (MenuRestaraunt menu : menuRestarauntList) {
                System.out.println(menu.toString());
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }}