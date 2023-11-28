package edu.francistuttle;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;

public class App {
    public static void main(String[] args) {
        try {
            Document document = readXMLDocumentFromFile(
                    "C:/Users/ak1048135/Downloads/Abe's git folder/assign2_xml/src/lab.xml");
            Element root = document.getDocumentElement();
            System.out.println(root.getNodeName());

            NodeList nList = document.getElementsByTagName("computer");
            System.out.println("============================");

            computerInfo(nList);
            /*
             * for (int temp = 0; temp < nList.getLength(); temp++)
             * {
             * Node node = nList.item(temp);
             * 
             * if (node.getNodeType() == Node.ELEMENT_NODE)
             * {
             * Element eElement = (Element) node;
             * System.out.println("\tComputer id : " + eElement.getAttribute("id"));
             * }
             * }
             */
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static Document readXMLDocumentFromFile(String fileNameWithPath) throws Exception {
        // Get Document Builder
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        // Build Document
        Document document = builder.parse(new File(fileNameWithPath));
        // Normalize the XML Structure; It's just too important !!
        document.getDocumentElement().normalize();
        return document;
    }

    public static void computerInfo(NodeList computer) {
        for (int temp = 0; temp < computer.getLength(); temp++) {
            Node node = computer.item(temp);

            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) node;
                System.out.println("Computer id : " + eElement.getAttribute("id"));
                System.out.println(
                        "\t Manufacturer: " + eElement.getElementsByTagName("manufacturer").item(0).getTextContent());
                System.out.println("\t Year Purchased: "
                        + eElement.getElementsByTagName("yearpurchased").item(0).getTextContent());
                System.out.println(
                        "\t Processor: " + eElement.getElementsByTagName("processor").item(0).getTextContent());
                Node monitors = eElement.getElementsByTagName("monitors").item(0);
                NodeList monitorList = ((Element) monitors).getElementsByTagName("monitor");
                getMonitors(monitorList);
                // System.out.println("Monitors id : " + eElement.getAttribute("id"));
                // System.out.println("\t Monitors: " +
                // eElement.getElementsByTagName("monitors").item(0).getTextContent());
            }
        }
    }

    public static void getMonitors(NodeList moni) {

        for (int mon = 0; mon < moni.getLength(); mon++) {
            Node node = moni.item(mon);
            Element eElement = (Element) node;
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                System.out.println("Monitor id : " + eElement.getAttribute("id"));
                System.out.println(
                        "\t\t Manufacturer: " + eElement.getElementsByTagName("manufacturer").item(0).getTextContent());
                System.out.println(
                        "\t\t Resolution: " + eElement.getElementsByTagName("resolution").item(0).getTextContent());
            }
        }
    }

}
