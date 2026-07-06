
import java.util.Scanner;

public class PizzaShop {
    public static void main(String [] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("=================================");
            System.out.println("     THANESH PIZZA SHOP");
            System.out.println("=================================");
            System.out.println("1. Veg Pizza        200");
            System.out.println("2. Chicken Pizza    350");
            System.out.println("3. Cheese Pizza     250");
            System.out.println("4. Coke             50");
            System.out.println("5. Exit");
            System.out.println("=================================");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            String selectedItem;
            int price;

            switch(choice) {
                case 1 -> {
                    selectedItem = "Veg Pizza";
                    price = 200;
                }
                case 2 -> {
                    selectedItem = "Chicken Pizza";
                    price = 350;
                }
                case 3 -> {
                    selectedItem = "Cheese Pizza";
                    price = 250;
                }
                case 4 -> {
                    selectedItem = "Coke";
                    price = 50;
                }
                case 5 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> {
                    System.out.println("Invalid choice.");
                    return;
                }
            }

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            if (quantity > 0) {
                int total = price * quantity;

                System.out.println("\n========== ORDER SUMMARY ==========");
                System.out.println("Item: " + selectedItem);
                System.out.println("Price: " + price);
                System.out.println("Quantity: " + quantity);
                System.out.println("Total Bill: " + total);
                System.out.println("===================================");
            } else {
                System.out.println("Quantity must be greater than 0.");
            }
        }
    }
}
