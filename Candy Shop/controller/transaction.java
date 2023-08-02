package controller;
public class transaction extends items{
    protected double bill;
    protected double balance;
    protected boolean check = false;

    public transaction() {
    }

    public transaction(double bill, double balance) {
        this.bill = bill;
        this.balance = balance;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
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

    public Boolean checkAvailability(int id, double qty) {
        boolean check = false;
        if (search(id)) {
            double stock=0;
            for (items ob : al){
                if (ob.id==id){
                    stock = ob.stock;
                }
            }
            if (stock>=qty){
                check=true;
            }
        }
        return check;
    }
    public void totalBill(int id, int qty) {
        double bill = 0;
        double salePrice = 0;
        if (checkAvailability(id, qty)) {
            for (items ob : al) {
                if (ob.id == id) {
                    salePrice = ob.getItemSalePrice();
                }
            }
            bill = salePrice * qty;
        }
        this.bill = bill;
    }
    public Boolean verifyMoney(double money) {
        boolean check = false;
        if (money >= bill) {
            check = true;
        }
        return check;
    }
    public void deductBalance(double money) {
        if (verifyMoney(money)) {
            money -= bill;
            this.balance = money;
        }
    }
    public void display(int id) {
        for (items ob : al) {
            if (ob.id == id) {
                System.out.println("**********************************************");
                System.out.println("Item id\t\t:\t" + ob.id);
                System.out.println("Items Name\t:\t" + ob.itemName);
                System.out.println("Price\t\t:\t" + ob.itemSalePrice);
            }
        }
    }
    public void addToSelled(int id,int quantity){
        int stock=0;
        int ItemSold=0;
        stock=quantity;
        ItemSold=quantity;
        vendingMachine.totalStock-=stock;
        vendingMachine.totalItemSold+=ItemSold;
        for (items ob: al){
            if (id==ob.id){
                ob.stock-=stock;
            }
        }
    }
    public void addToProfit(int id){
        for (items ob:al){
            if (id==ob.id){
                ob.profit+= bill;
            }
        }
    }
    public void dispenseItem(int id,int qty,double money){
        if (search(id)) {
            if (checkAvailability(id, qty)) {
                totalBill(id, qty);
                if (verifyMoney(money)) {
                    deductBalance(money);
                    System.out.println("Item dispensed!");
                    display(id);
                    System.out.println("quantity\t:\t" + qty);
                    System.out.println("Total bill\t:\t" + getBill());
                    System.out.println("Balance\t\t:\t" + getBalance());
                    System.out.println("**********************************************");
                    setCheck(true);
                    addToProfit(id);
                    addToSelled(id,qty);
                } else {
                    System.out.println("Not enough money");
                }
            } else {
                System.out.println("Not enough stock");
            }
        }else{
            System.out.println("Item not found");
        }
        }
    }









