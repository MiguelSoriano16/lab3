package PaqComercio;
import java.time.LocalDate;

public class Business implements Cloneable{
    String name;
    String address;
    String ID;
    double [][]dailySale;
    int[] stock;
    Employee[] employees;

    Business(){
    }
    Business(String name,String address,String ID){
        this.name=name;
        this.address=address;
        this.ID=ID;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public String getID() {
        return ID;
    }
    public void setDailySale(double[][] dailySale) {
        this.dailySale = dailySale;
    }
    public double[][] getDailySale() {
        return dailySale;
    }
    public void setStock(int[] stock) {
        this.stock = stock;
    }
    public int[] getStock() {
        return stock;
    }
    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }
    public Employee[] getEmployees() {
        return employees;
    }

    double calculateTotalSales(){
        double sum = 0;
        for (int i=0; i<12; i++){
            for (int j=0; j<31; j++){
                sum += dailySale[i][j];
            }
        }
        return sum;
    }
    double calculateSalesMonth(int month){
        double sum = 0;
        for (int j=0; j<31; j++){
            sum += dailySale[month][j];
        }
        return sum;
    }
    int monthMayorSales(){
        int sum = 0;
        int sumMayor = 0;
        int monthMayor = 0;
        for (int i=0; i<12; i++){
            for (int j=0; j<31; j++){
                sum += dailySale[i][j];
            }
            if (sum > sumMayor){
                sumMayor = sum;
                monthMayor = i;
            }
            sum = 0;
        }
        return monthMayor;
    }

    void updateSales(int amount){
        LocalDate today = LocalDate.now();
        int diaActual = today.getDayOfMonth();
        int mesActual = today.getMonthValue();
        dailySale[mesActual][diaActual]=amount;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Business deepClone()throws CloneNotSupportedException{
        Business cloneBusiness=(Business) super.clone();
        cloneBusiness.dailySale=this.dailySale;
        cloneBusiness.address=this.address;
        cloneBusiness.name=this.name;
        cloneBusiness.ID=this.ID;
        cloneBusiness.stock=this.stock;
        cloneBusiness.employees=this.employees;
        return cloneBusiness;
    }
}

