public class GroceryItem {
    private final String name;
    private boolean checkedOff;

    public GroceryItem(String name) {
        this.name = name;
        this.checkedOff = false;
    }

    public String getName() {
        return name;
    }


    public void setCheckedOff(boolean checkedOff) {
        this.checkedOff = checkedOff;
    }

    @Override
    public String toString() {
        return name + " " + ((checkedOff) ? "X" : "-");
    }
}
