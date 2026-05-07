import java.util.ArrayList;
import java.util.List;

public class CoffeeShop {
    private String shopName;
    private int maxCapacity;
    private boolean isOpen;
    private List<String> menu;
    private double totalRevenue;

    public CoffeeShop(String shopName, int maxCapacity){
        this.shopName = shopName;
        this.maxCapacity = maxCapacity;
        this.isOpen = false;
        this.menu = new ArrayList<>();
        this.totalRevenue = 0.0;
    }

    public void openShop() {
        isOpen = true;
        System.out.println(shopName + " is now open!");
    }

    public void addMenuItem(String item) {
        menu.add(item);
    }


    public void processOrder(String item, double price) {
        if (!isOpen) {
            System.out.println("Sorry, we are closed!");
        } else {
            try {
                totalRevenue += price;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.println("Order placed: " + item);
        }
    }

//    public void processOrder(String item, double price) {
//        if (!isOpen) {
//            System.out.println("Sorry, we are closed!");
//            return;
//        }
//        try {
//            totalRevenue += price;
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("Order placed: " + item);
//    }

    public double calculateTax(double taxRate) {
        return totalRevenue * taxRate;
    }

    public static void main(String[] args) {
        CoffeeShop shop    = new CoffeeShop("Brew & Code", 50);
        String greeting = "Welcome to our coffee shop";
        int[] popularItems = {3, 1, 4, 1, 5};
        boolean isPeakHour = true;
        List<String> orders = new ArrayList<>();
    }
}










