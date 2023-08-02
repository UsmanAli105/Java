package controller;
public class customer extends transaction {
    protected    int choice;
    protected    int itemQuantity;
    protected    double cash;

    public customer() {
    }

    public customer(int choice, int itemQuantity, double cash) {
        this.choice = choice;
        this.itemQuantity = itemQuantity;
        this.cash = cash;
    }

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public void viewItems() {
        for (items ob : al) {
            System.out.println("_________________________________________");
            System.out.println("Item id \t:\t" + ob.id);
            System.out.println("Items Name \t:\t" + ob.itemName);
            System.out.println("Price\t\t:\t" + ob.itemSalePrice);
        }
    }



}
