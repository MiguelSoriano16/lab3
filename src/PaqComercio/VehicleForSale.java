package PaqComercio;

public class VehicleForSale extends Vehicle{
    double price;
    int discount;


    VehicleForSale(){
    }
    VehicleForSale(double price,int discount){
        this.price=price;
        this.discount=discount;
    }


    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public void setDiscount(int discount) {
        this.discount = discount;
    }
    public int getDiscount() {
        return discount;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
