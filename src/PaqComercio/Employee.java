package PaqComercio;

public class Employee {
    String ID_number;
    String name;
    protected String address;
    protected int phoneNumber;
    String email;
    protected String startDate;
    protected double salary;
    String position;

    Employee(){}
    Employee(String ID_number,String name,String address,int phoneNumber,String email,String startDate,double salary,String position){
        this.ID_number=ID_number;
        this.name=name;
        this.address=address;
        this.phoneNumber=phoneNumber;
        this.email=email;
        this.startDate=startDate;
        this.salary=salary;
        this.position=position;
    }

    public void setID_number(String ID_number) {
        this.ID_number = ID_number;
    }

    public String getID_number() {
        return ID_number;
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
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public String getPosition() {
        return position;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    public String getStartDate() {
        return startDate;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
