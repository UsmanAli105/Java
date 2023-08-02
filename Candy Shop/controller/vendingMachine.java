package controller;
import java.util.ArrayList;
public class vendingMachine {
    protected    String location;
    protected        int capacity;
    protected        double totalItemBought;
    protected        static double ItemSold;
    static double totalItemSold;
    protected        double stock;
    static double totalStock;
    protected         double investment;
    protected        double profit;
    static double totalProfit;
    public static ArrayList<items> al = new ArrayList<items>();
    public vendingMachine() {
    }

    public vendingMachine(String location, int capacity, double totalItemBought, double totalItemSold, double stock, double investment) {
        this.location = location;
        this.capacity = capacity;
        this.totalItemBought = totalItemBought;
        this.investment = investment;
    }

    public vendingMachine(String location, int capacity, double totalItemBought, double investment,double stock) {
        this.location = location;
        this.capacity = capacity;
        this.totalItemBought = totalItemBought;
        this.investment = investment;
        this.stock = stock;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getTotalItemBought() {
        return totalItemBought;
    }

    public void setTotalItemBought(double totalItemBought) {
        this.totalItemBought = totalItemBought;
    }

    public static double getItemSold() {
        return ItemSold;
    }

    public static void setItemSold(double itemSold) {
        ItemSold = itemSold;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public static double getTotalStock() {
        return totalStock;
    }

    public static void setTotalStock(double totalStock) {
        vendingMachine.totalStock = totalStock;
    }

    public double getInvestment() {
        return investment;
    }

    public void setInvestment(double investment) {
        this.investment = investment;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public static void setAl(ArrayList al) {
        items.al = al;
    }

    public static double getTotalItemSold() {
        return totalItemSold;
    }

    public static void setTotalItemSold(double totalItemSold) {
        vendingMachine.totalItemSold = totalItemSold;
    }

    public static double getTotalProfit() {
        return totalProfit;
    }

    public static void setTotalProfit(double totalProfit) {
        vendingMachine.totalProfit = totalProfit;
    }
}
