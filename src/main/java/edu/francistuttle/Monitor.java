package edu.francistuttle;

public class Monitor {
    String monitorID;
    String mointormManufacturer;
    String resolution;

    public Monitor(String monitorID, String mointormManufacturer, String resolution) {
        this.monitorID = monitorID;
        this.mointormManufacturer = mointormManufacturer;
        this.resolution = resolution;
    }

    public void getMonitorsID() {
        System.out.println(monitorID);
    }

    @Override
    public String toString() {

        return "Monitor ID :" + monitorID + " Manufacturer: " + mointormManufacturer + " Resolution :" + resolution;
    }

}
