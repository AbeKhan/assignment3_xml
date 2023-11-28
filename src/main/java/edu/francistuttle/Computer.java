package edu.francistuttle;

public class Computer {
    String computerID;
    String computerManufacturer;
    String yearPurchased;
    String processor;

    public Computer(String computerID, String computerManufacturer, String yearPurchased, String processor) {
        computerID = this.computerID;
        computerManufacturer = this.computerManufacturer;
        yearPurchased = this.yearPurchased;
        processor = this.processor;
    }

    @Override
    public String toString() {

        return "Computer ID: " + computerID + "Manufacturer: " + computerManufacturer + "Year Purchased: "
                + yearPurchased + "Processor: " + processor;

    }
}