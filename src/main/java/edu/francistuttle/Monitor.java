package edu.francistuttle;

public class Monitor {
    String monitorID;
    String mointormManufacturer;
    String resolution;

    public Monitor(String monitorID, String mointormManufacturer, String resolution) {
        monitorID = this.monitorID;
        mointormManufacturer = this.mointormManufacturer;
        resolution = this.resolution;
    }

    public void getMonitorsID() {
        System.out.println(mointormManufacturer);
    }

    @Override
    public String toString() {

        return "Monitor ID:" + monitorID + "Manufacturer" + mointormManufacturer + "Resolution" + resolution;
    }

}
