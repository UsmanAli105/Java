import controller.*;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);
        admin boss = new admin("admin", "123");
        customer person = new customer();
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        FileWriter myWriter = null;
	String location = "GCU,Lahore";
        
        try {
            myWriter = new FileWriter("Vending Machine.txt");

        } catch (IOException e) {

        }

        Boolean check1 = true;
        String uname = null;
        String upass = null;



	/*
        System.out.println("Enter Location");

	location = input.next();
	*/ 
	// Write in the data file
       boss.setLocation(location);
        try {
            boss.setTime(time);
            boss.setDate(date);
            myWriter.write("Vending Machine\n");
            myWriter.write("Start\t:\t"+boss.getTime()+" "+boss.getDate()+"\n");
            myWriter.write("Location\t:\t"+boss.getLocation()+"\n");

        } catch (IOException e) {

        }

        boolean check3 = true;
        int opt = 0;
        boolean check2;
        int count=0;
	// Admin login 
            while (check3) {
                while (check1) {
                    System.out.println("Enter username for admin");
                    uname = input.next();
                    System.out.println("Enter password");
                    upass = input.next();

                    if (boss.login(uname, upass)) {
                        check1 =false;
                    } else {
                        System.out.println("Invalid username or password");
                    }
                }
		//Control Panel for admin

                System.out.println("*************************************************");
                System.out.println("*\t\tWelcome to Vending Machine\t*");
                System.out.println("*\t1.Add items \t 2.View Items\t\t*");
                System.out.println("*\t3.Delete items \t 4.Search Items\t\t*");
                System.out.println("*\t5.Check sale \t 6.Start Machine\t*");
                System.out.println("*\t7.Stop Machine\t\t\t\t*");
                System.out.println("*************************************************");

                try {
                    opt = input.nextInt();
                } catch (InputMismatchException e) {
                  System.out.println("Error");

                }
                switch (opt) {
                    case 1:
			//Adding items

                        items item1 = new items("location", 100, 100, 100, 2500, 2000, "Sprite", 25, 20, 100);
                        items item2 = new items("location", 100, 100, 100, 2500, 2001, "Coca-Cola", 28, 22, 100);
                        items item3 = new items("location", 100, 100, 100, 2500, 2002, "Marinda", 30, 25, 100);
                        items item4 = new items("location", 100, 100, 100, 2500, 2003, "Lays", 12, 10, 100);
                        items item5 = new items("location", 100, 100, 100, 2500, 2004, "Kurkure", 10, 8, 100);
                        items item6 = new items("location", 100, 100, 100, 2500, 2005, "Salanty", 8, 5, 100);
                        items item7 = new items("location", 100, 100, 100, 2500, 2006, "Rio", 20, 18, 100);
                        items item8 = new items("location", 100, 100, 100, 2500, 2007, "Candy", 22, 20, 100);
                        items item9 = new items("location", 100, 100, 100, 2500, 2008, "Sooper", 25, 22, 100);
                        items.al.add(item1);
                        items.al.add(item2);
                        items.al.add(item3);
                        items.al.add(item4);
                        items.al.add(item5);
                        items.al.add(item6);
                        items.al.add(item7);
                        items.al.add(item8);
                        items.al.add(item9);
                        admin.totalStock();
                        try {

                            for (items ob : vendingMachine.al) {
                                myWriter.write("_________________________________________\n");
                                myWriter.write("\t\tItems added\n");
                                myWriter.write("_________________________________________\n");

                                myWriter.write("Item id \t:\t" + ob.getId() + "\n");
                                myWriter.write("Items Name \t:\t" + ob.getItemName() + "\n");
                                myWriter.write("Price\t\t:\t" + ob.getItemSalePrice() + "\n");
                                myWriter.write("Qty\t\t:\t" + ob.getQuantity() + "\n");
                            }

                            System.out.println("Items added");

                        } catch (IOException e) {
                            System.out.println("Error");
                        }
                        break;
                    case 2:
                        boss.viewItems();
                        break;
                    case 3:
                        int del;
                        System.out.println("Enter id");
                        del = input.nextInt();
                        boss.deleteItems(del);
                        break;
                    case 4:
                        int search;
                        System.out.println("Enter id");
                        search = input.nextInt();
                        if (boss.search(search)) {
                            boss.displayItems(search);
                        } else {
                            System.out.println("Item not found");
                        }
                        break;
                    case 5:
                        boss.checkSale();
                        break;
                    case 6:
                        boolean check4 = true;

                        while (check4) {
                            double cash;
                            int choice;
                            int quantity;
                            System.out.println("_________________________________________");
                            System.out.println("\t\tVending Machine");
                            System.out.println("Enter cash");
                            cash = input.nextDouble();
                            if (cash == -1) {
                                check1 = true;
                                check4 = false;
                                continue;
                            }
                            System.out.println("Following items are available");
                            person.viewItems();
                            System.out.println("Enter choice");
                            choice = input.nextInt();
                            System.out.println("Enter quantity");
                            quantity = input.nextInt();
                            System.out.println("Do you want to buy Y/N");
                            String confirm;
                            confirm = input.next();
                            if (confirm.equalsIgnoreCase("y")) {
                                person.dispenseItem(choice, quantity, cash);
				// Write the items added in the datafile
                                try {
                                    count++;

                                    myWriter.write("_________________________________________\n");
                                    myWriter.write("\t\tSale Record\n");
                                    myWriter.write("_________________________________________\n");
                                    myWriter.write("Customer Number\t:\t" + count + "\n");
                                    myWriter.write("Price entered\t:\t" + cash + "\n");
                                    myWriter.write("Choice\t\t:\t" + choice + "\n");
                                    myWriter.write("Quantity\t:\t" + quantity + "\n");
                                    myWriter.write("Total Bill\t:\t" + person.getBill() + "\n");
                                    if (person.isCheck()) {
                                        System.out.println("_________________________________________");
                                    } else {
                                        myWriter.write("Transaction Not performed\n");

                                    }

                                } catch (IOException e) {
                                    System.out.println("Error");
                                }

                            } else if (confirm.equalsIgnoreCase("n")) {
                                System.out.println("Transaction Cancelled");
                            } else {
                                System.out.println("Error");
                            }
                        }
                        break;
                    case 7:
                        date = LocalDate.now();
                        time = LocalTime.now();
                        try {
                            boss.setTime(time);
                            boss.setDate(date);
                            myWriter.write("_________________________________________\n");
                            myWriter.write("Machine Stop\t:\t" + boss.getTime() + " " + boss.getDate() + "\n");
                            myWriter.close();

                        } catch (IOException e) {
                            System.out.println("Error");
                        }
                        check1 = false;
                        check3 = false;
                        break;
                    default:
                        System.out.println("Invalid input");
                        break;
                }
            }

    }

}