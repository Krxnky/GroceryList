import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean running = true;
        GroceryList list = new GroceryList();

        while(running)
        {
            System.out.println("Welcome to Grocery List");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. Check off an item");
            System.out.println("4. Display your list");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter item name:");
                    String name = scanner.next();
                    if(!list.itemExists(name)) {
                        list.addItem(new GroceryItem(name));
                    }
                    else System.out.println("Item already exists");
                    list.printList();
                    break;
                case 2:
                    System.out.println("Enter item name or index:");
                    if(scanner.hasNextInt())
                    {
                        int index = scanner.nextInt();
                        list.removeItem(index);
                    }
                    else if(scanner.hasNext())
                    {
                        String name2 = scanner.next();
                        list.removeItem(name2);
                    }
                    list.printList();
                    break;
                case 3:
                    System.out.println("Enter item name or index:");
                    if(scanner.hasNextInt())
                    {
                        int index = scanner.nextInt();
                        list.checkOffItem(index);
                    }
                    else if(scanner.hasNext())
                    {
                        String name3 = scanner.next();
                        list.checkOffItem(name3);
                    }
                    list.printList();
                    break;
                case 4:
                    list.printList();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

    }
}