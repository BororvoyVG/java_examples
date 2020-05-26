package objects_and_apis.custom_classes.utilities;

public class MathHelper {

    private int total;

//    public static final String ADD = "add";
//    public static final String SUBTRACT = "subtract";

    public MathHelper(int total) {
        this.total += total;
    }

    public int getTotal() {
        return total;
    }

    public int doMath(String prompt, Operation operation) throws NumberFormatException {
        String input = InputHelper.getInput(prompt);

        int value = Integer.parseInt(input);
        switch (operation) {
            case ADD:
                total +=value;
                break;
            case SUBTRACT:
                total -=value;
                break;
        }
        return value;
    }

    public enum Operation {
        ADD, SUBTRACT;
    }
}
