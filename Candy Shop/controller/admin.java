package controller;
import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

public class admin extends purchase {

    protected      String username;
    protected      String password;
    private String filepath = "database/database.csv";

    public admin() {
    }

    public admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }
	// Searching items
    public Boolean search(int id) {
        Boolean check = false;
        for (items ob : al) {
            if (ob.id == id) {
                check = true;
                break;
            }
        }
        return check;
    }
		//view all items
    public void viewItems() {
        for (items ob : al) {
            System.out.println("_________________________________________");
            System.out.println("Item id \t:\t" + ob.id);
            System.out.println("Items Name \t:\t" + ob.itemName);
            System.out.println("Price\t\t:\t" + ob.itemSalePrice);
            System.out.println("Qty\t\t:\t"+ob.quantity);
            System.out.println("Stock\t\t:\t"+ob.stock);
        }
    }
	// view items by id
    public void displayItems(int id) {
        for (items ob : al) {
            if (ob.id==id) {
                System.out.println("_________________________________________");
                System.out.println("Item id \t:\t" + ob.id);
                System.out.println("Items Name \t:\t" + ob.itemName);
                System.out.println("Price\t\t:\t" + ob.itemSalePrice);
                System.out.println("Qty\t\t:\t"+ob.quantity);
                System.out.println("Stock\t\t:\t"+ob.stock);
            }
        }
    }
	// calculates the total items bought
    public void totalItemsBought(){
        double totalItemBought=0;
        for (items ob : al){
            totalItemBought+=ob.quantity;
        }
        setTotalItemBought(totalItemBought);
    }
	//deletes an item from the array
    public void deleteItems(int id){
        int count = -1;
        for (items ob: al){
            if (ob.id==id){
                count++;
            }
        }
        if (count>=0) {
            al.remove(count);
            System.out.println("Item removed");
        }else {
            System.out.println("item Not found");
        }
        }
    public void countInvestment(){
        double investment = 0;
        for (items ob : al){
            investment+=ob.investment;
        }
        setInvestment(investment);
    }
    public void calculateTotalProfit(){
        double totalProfit=0;
        for (items ob: al) {
            totalProfit += ob.profit;
        }
        setTotalProfit(totalProfit);
    }
    public void checkSale(){
        totalItemsBought();
        countInvestment();
        calculateTotalProfit();
        System.out.println("_____________________________________________________");
        System.out.println("Number of bought items\t:\t"+getTotalItemBought());
        System.out.println("Total Stock\t\t:\t"+getTotalStock());
        System.out.println("Number of items Sold\t:\t"+getTotalItemSold());
        System.out.println("Total Investmen\t\t:\t"+getInvestment());
        System.out.println("Total Profit\t\t:\t"+getTotalProfit());
        System.out.println("_____________________________________________________");
    }
    public static void totalStock(){
        double stock=0;
        for (items ob:al ){
            stock+= ob.stock;
        }
        setTotalStock(stock);
    }

	// login method
    public boolean login(String uname, String upass) {
        boolean check = false;
       String temp_uname=null;
       String temp_upass=null;
       try {
           if (new File(getFilepath()).exists()) {
               Scanner x = new Scanner(new File(getFilepath()));

               while (x.hasNext() && !check) {
                   StringTokenizer y= new StringTokenizer(x.nextLine(),",");
                   temp_uname = y.nextToken();
                   temp_upass = y.nextToken();
                   if (temp_uname.trim().equals(uname.trim()) && temp_upass.trim().equals(upass.trim())) {
                       check = true;
                   }
               }
               x.close();
           }
       }catch (Exception e){
           System.out.println("Error");
           e.printStackTrace();
       }
        return check;
    }
}
