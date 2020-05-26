package objects_and_apis.custom_classes;

import objects_and_apis.custom_classes.utilities.MathHelper;

import static objects_and_apis.custom_classes.utilities.MathHelper.Operation.ADD;
import static java.lang.String.format;

public class Main {
    public static void main(String[] args) {
        MathHelper mathHelper = new MathHelper(100);

        try {
            while (true) {
                int input = mathHelper.doMath("Enter a number: ", ADD);
                int total = mathHelper.getTotal();
                String message = format("Entered: %d, total: %d", input, total);
                System.out.println(message);
            }
        } catch (NumberFormatException e) {
            System.out.println("All done!");
        }
    }
}
