
import java.util.Scanner;

public class PizzaShop {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

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

    switch (choice) {
    case 1:
        System.out.println("You selected Veg Pizza.");
        break;

    case 2:
        System.out.println("You selected Chicken Pizza.");
        break;

    case 3:
        System.out.println("You selected Cheese Pizza.");
        break;

    case 4:
        System.out.println("You selected Coke.");
        break;

    case 5:
        System.out.println("Thank you for visiting Thanesh Pizza Shop!");
        break;

    default:
        System.out.println("Invalid choice. Please select an option from 1 to 5.");
}
    }
}