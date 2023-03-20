package PaqComercio;

public class Restaurant extends Business{
    String []dailyMenu;
    int numberTables;
    int capacity;
    Restaurant(){}
    Restaurant(String []dailyMenu,int numberTables,int capacity){
        this.dailyMenu=dailyMenu;
        this.numberTables=numberTables;
        this.capacity=capacity;
    }


    public void setDailyMenu(String []dailyMenu) {
        this.dailyMenu = dailyMenu;
    }
    public String[] getDailyMenu() {
        return dailyMenu;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setNumberTables(int numberTables) {
        this.numberTables = numberTables;
    }
    public int getNumberTables() {
        return numberTables;
    }

    void fixDailyMenu(String menu,int dayOfWeed){
        dailyMenu[dayOfWeed]=menu;
    }
    String reviewDailyMenu(int dayOfWeed){
        return dailyMenu[dayOfWeed];
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
