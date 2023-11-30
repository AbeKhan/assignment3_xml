package edu.francistuttle;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;

public class App {
    public static void main(String[] args) {
        ComputerLab lab = new ComputerLab();

        for(int comp = 0; comp < lab.parse().size(); comp++)
        {
            System.out.println(lab.parse().get(comp));
        }

        
    }
}
