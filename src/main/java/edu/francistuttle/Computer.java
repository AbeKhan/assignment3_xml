package edu.francistuttle;

import java.lang.reflect.Array;
import java.util.*;

public class Computer {
    String computerID;
    String computerManufacturer;
    String yearPurchased;
    String processor;
    ArrayList<Monitor> mList;

    public Computer(String computerID, String computerManufacturer, String yearPurchased, String processor,
            ArrayList<Monitor> mList) {
        this.computerID = computerID;
        this.computerManufacturer = computerManufacturer;
        this.yearPurchased = yearPurchased;
        this.processor = processor;
        this.mList = mList;
    }

    @Override
    public String toString() {

        return "Computer ID: " + computerID + " Manufacturer: " + computerManufacturer + " Year Purchased: "
                + yearPurchased + " Processor: " + processor + listToString();

    }

    public String listToString() {
        String holder = "";
        for (int mon = 0; mon < mList.size(); mon++) {
            holder += mList.get(mon) + " ";
        }
        return holder;
    }

}