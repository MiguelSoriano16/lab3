package PaqComercio;

public class VehicleToRepair extends Vehicle {
    String accident;
    boolean repaired;
    int priority;

    VehicleToRepair() {
    }

    VehicleToRepair(String accident, boolean repaired, int priority) {
        this.accident = accident;
        this.repaired = repaired;
        this.priority = priority;
    }

    public void setAccident(String accident) {
        this.accident = accident;
    }
    public String getAccident() {
        return accident;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

