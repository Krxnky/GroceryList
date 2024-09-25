import java.util.ArrayList;
import java.util.List;

public class GroceryList {
    private List<GroceryItem> items;

    public GroceryList() {
        items = new ArrayList<GroceryItem>();
    }

    public void addItem(GroceryItem item) {
        items.add(item);
    }

    public void removeItem(int index) {
        items.remove(index);
    }

    public void removeItem(String itemName)
    {
        items.removeIf(item -> item.getName().equalsIgnoreCase(itemName));
    }

    public boolean itemExists(String itemName) {
        for (GroceryItem item : items) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                return true;
            }
        }

        return false;
    }

    public void checkOffItem(String itemName) {
        for (GroceryItem item : items) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                item.setCheckedOff(true);
            }
        }
    }

    public void checkOffItem(int index) {
        items.get(index).setCheckedOff(true);
    }

    public void printList() {
        System.out.println("Grocery List:");
        for (int i = 0; i < items.size(); i++) {
            GroceryItem item = items.get(i);
            System.out.println(i + ". " + item.toString());
        }
    }

}
