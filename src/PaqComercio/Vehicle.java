package PaqComercio;

public class Vehicle {
    String brand;
    boolean repaired;
    String licensePlate;

    Vehicle(){
    }
    Vehicle(String brand,boolean repaired,String licensePlate){
        this.brand=brand;
        this.repaired=repaired;
        this.licensePlate=licensePlate;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
    public void setRepaired(boolean repaired) {
        this.repaired = repaired;
    }
    public boolean isRepaired() {
        return repaired;
    }
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
    public String getLicensePlate() {
        return licensePlate;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
