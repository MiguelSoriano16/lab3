package PaqComercio;

public class Dealer extends Business {
    VehicleForSale []V;
    VehicleToRepair []R;
    Dealer(){}
    Dealer(VehicleForSale []V,VehicleToRepair []R){
        this.V=V;
        this.R=R;
    }
    static int counterSale;
    public void setV(VehicleForSale[] v) {
        V = v;
    }
    public VehicleForSale[] getV() {
        return V;
    }
    public void setR(VehicleToRepair[] r) {
        R = r;
    }
    public VehicleToRepair[] getR() {
        return R;
    }

    void addRepair(VehicleToRepair vehicle){
        VehicleToRepair[] temp = new VehicleToRepair[this.R.length];
        int count = 0;
        for (int i = 0; i<this.R.length; i++){
            temp[i] = this.R[i];
        }
        if (vehicle.priority == 1){
            while ((this.R[count].priority == 1)&&(count<this.R.length)){
                count++;
            }
            if (count<this.R.length){
                this.R[count] = vehicle;
                for (int i=count+1; i<this.R.length-count+1; i++){
                    this.R[i] = temp[i-1];
                }
                System.out.println("Vehicle stored");
            }
        }
        count = 0;
        if (vehicle.priority == 2) {
            while ((this.R[count].priority == 1) && (count < this.R.length)) {
                count++;
            }
            while ((this.R[count].priority == 2) && (count < this.R.length)) {
                count++;
            }
            if (count<this.R.length) {
                this.R[count] = vehicle;
                for (int i = count + 1; i < this.R.length - count + 1; i++) {
                    this.R[i] = temp[i - 1];
                }
                System.out.println("Vehicle stored");
            }
        }
        count = 0;
        if (vehicle.priority == 3){
            count = this.R.length;
            this.R[count+1] = vehicle;
            System.out.println("Vehicle stored");
        }

    }
    void repairVehicle(int index){
        this.R[index].repaired=true;
    }

    Vehicle receiveVehicle(String lincensePlate){
        for(int i=0;i<this.R.length;i++){
            if(this.R[i].licensePlate.equals(lincensePlate)){
                Vehicle vehicle=new Vehicle();
                vehicle=this.R[i];
                this.R[i]=null;
                return vehicle;
            }
        }
        return null;
    }
    void addSale(Vehicle vehicle){
        this.V[counterSale].licensePlate=vehicle.licensePlate;
        this.V[counterSale].brand= vehicle.brand;
        this.V[counterSale].repaired= vehicle.repaired;
        counterSale++;
    }
    void sellVehicle(int index){
        this.V[index]=null;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
