package edu.francistuttle;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ComputerLab lab = new ComputerLab();
        ArrayList<Computer> computer = new ArrayList<Computer>();
        computer = lab.parse();
        for (int comp = 0; comp < computer.size(); comp++) {
            System.out.println(computer.get(comp));
        }

    }
}
