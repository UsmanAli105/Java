package controller;


public class items extends vendingMachine {

    protected    int id;
    protected    String itemName;
    protected    int itemSalePrice;
    protected    int itemPurchasePrice;
    protected    double quantity;
    

    public items() {
    }

    public items(int id, String itemName, int itemSalePrice, int itemPurchasePrice, int quantity) {
        this.id = id;
        this.itemName = itemName;
        this.itemSalePrice = itemSalePrice;
        this.itemPurchasePrice = itemPurchasePrice;
        this.quantity = quantity;

    }

    public items(String location, int capacity, double totalItemBought, double stock, double investment, int id, String itemName, int itemSalePrice, int itemPurchasePrice, double quantity) {
        super(location, capacity, totalItemBought, investment,stock);
        this.id = id;
        this.itemName = itemName;
        this.itemSalePrice = itemSalePrice;
        this.itemPurchasePrice = itemPurchasePrice;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemSalePrice() {
        return itemSalePrice;
    }

    public void setItemSalePrice(int itemSalePrice) {
        this.itemSalePrice = itemSalePrice;
    }

    public int getItemPurchasePrice() {
        return itemPurchasePrice;
    }

    public void setItemPurchasePrice(int itemPurchasePrice) {
        this.itemPurchasePrice = itemPurchasePrice;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
