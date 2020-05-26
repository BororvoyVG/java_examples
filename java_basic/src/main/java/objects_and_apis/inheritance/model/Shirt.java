package objects_and_apis.inheritance.model;

public class Shirt extends ClothingItem {

    private String pattern = "Not set";

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public Shirt(String size, double price) {
        super("Shirt", size, price);
    }

    @Override
    public double getPrice() {
        return 22.0;
    }
}
