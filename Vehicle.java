public class Vehicle {
    private String licensePlate;
    private String ownerName;
    private boolean isVip;

    public Vehicle(String licensePlate, String ownerName, boolean isVip) {
        this.licensePlate = licensePlate;
        this.ownerName = ownerName;
        this.isVip = isVip;
    }

    public String getLicensePlate() {
        return licensePlate;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public boolean isVip() {
        return isVip;
    }
   
    public String toString() {
        return "Vehicle{" + "License='" + licensePlate + "', Owner='" + ownerName + "', VIP=" + isVip+ '}';
    }
    
}
