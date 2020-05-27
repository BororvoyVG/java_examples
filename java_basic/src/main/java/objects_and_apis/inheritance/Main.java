package objects_and_apis.inheritance;


import objects_and_apis.inheritance.model.ClothingItem;
import objects_and_apis.inheritance.model.Product;
import objects_and_apis.inheritance.model.Shirt;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        ClothingItem item = new ClothingItem("Shirt", "L", 19.99);
//        displayProduct(item);

        Shirt shirt = new Shirt("M", 14.99);
        displayProduct(shirt);
        shirt.setPattern("Plaid");
        System.out.println("This shirt's pattern is " + shirt.getPattern());

        ClothingItem reallyAShirt = new Shirt("L", 12.99);
        displayProduct(reallyAShirt);

        Shirt shirt2 = (Shirt) reallyAShirt;
        shirt2.setPattern("Solid");
        System.out.println("Pattern = " + shirt2.getPattern());

        ClothingItem[] items =new ClothingItem[3];
        items[0] = new ClothingItem("Shirt","L",15) {
            @Override
            public double getPrice() {
                return this.getPrice();
            }
        };
    }

    private static void displayProduct(Product product) {
        String output = product.getClass().getSimpleName() + "{" +
                "type='" + product.getType() + '\'' +
                ", size='" + product.getSize() + '\'' +
                ", price=" + product.getPrice() +
                '}';
        System.out.println(output);
    }
}
