package small;
import java.util.Scanner;

public class RestaurantOrdering {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // define the menu sections and their items
        String[] sectionNames = {"Appetizers", "Main Courses", "Sides", "Drinks"};
        String[][] sectionItems = {
            {"Nachos", "Garlic Bread", "Wings"},
            {"Steak", "Burger", "Pizza", "Salmon"},
            {"Fries", "Onion Rings", "Mashed Potatoes"},
            {"Soda", "Water", "Beer", "Wine"}
        };
        double[][] sectionPrices = {
            {8.99, 6.99, 9.99},
            {20.99, 12.99, 14.99, 18.99},
            {3.99, 4.99, 5.99},
            {2.99, 1.99, 5.99, 8.99}
        };
        
        // ask the user how many items they want to order
        System.out.print("How many items do you want to order? ");
        int numItems = input.nextInt();
        
        // initialize the order arrays
        String[] orderItems = new String[numItems];
        int[] orderQuantities = new int[numItems];
        
        // ask the user for each item and quantity they want to order
        for (int i = 0; i < numItems; i++) {
            System.out.print("Enter item " + (i+1) + ": ");
            String item = input.next();
            System.out.print("Enter quantity for item " + (i+1) + ": ");
            int quantity = input.nextInt();
            
            // add the item and quantity to the order arrays
            orderItems[i] = item;
            orderQuantities[i] = quantity;
        }
        
        // calculate the total cost of the order
        double totalCost = 0.0;
        for (int i = 0; i < numItems; i++) {
            int itemIndex = -1;
            int sectionIndex = -1;
            for (int j = 0; j < sectionItems.length; j++) {
                for (int k = 0; k < sectionItems[j].length; k++) {
                    if (sectionItems[j][k].equalsIgnoreCase(orderItems[i])) {
                        itemIndex = k;
                        sectionIndex = j;
                        break;
                    }
                }
                if (itemIndex != -1) {
                    break;
                }
            }
            if (itemIndex != -1) {
                totalCost += sectionPrices[sectionIndex][itemIndex] * orderQuantities[i];
            }
        }
        
        // display the order details and total cost
        System.out.println("\nOrder Details:");
        for (int i = 0; i < numItems; i++) {
            System.out.println(orderItems[i] + ": " + orderQuantities[i]);
        }
        System.out.println("Total Cost: $" + totalCost);
    }
}
