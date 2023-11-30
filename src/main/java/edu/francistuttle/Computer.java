package edu.francistuttle;

public class Computer {
    String computerID;
    String computerManufacturer;
    String yearPurchased;
    String processor;
    Monitor one;
    Monitor two;

    public Computer(String computerID, String computerManufacturer, String yearPurchased, String processor, Monitor one, Monitor two) {
        computerID = this.computerID;
        computerManufacturer = this.computerManufacturer;
        yearPurchased = this.yearPurchased;
        processor = this.processor;
        one = this.one;
        two = this.two;
    }

    @Override
    public String toString() {

        return "Computer ID: " + computerID + "Manufacturer: " + computerManufacturer + "Year Purchased: "
                + yearPurchased + "Processor: " + processor;

    }
}