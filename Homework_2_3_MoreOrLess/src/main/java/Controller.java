import java.util.Scanner;


public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processGame(){
        Scanner sc = new Scanner(System.in);
        model.setInitialBarrier(0, 100);
        model.setChosenValue();
        while (model.checkEnteredNumber(inputIntegersWithScanner(sc)));

        view.printMessage(View.CONGRATULATION + model.getChosenValue());
        view.printMessage(View.ENTERED_NUMBERS + model.getEnteredNumbers());
    }

    private int inputIntegersWithScanner(Scanner sc) {
        int EnteredNumber;
        view.printMessage(View.INPUT_INT_DATA + View.OPENS_SQUARE_BRACKET + model.getMinBound() + View.SPACE_SIGN
                + model.getMaxBound() + View.CLOSING_SQUARE_BRACKET);
        while (true) {
            while (!sc.hasNextInt()) {
                view.printMessage(View.WRONG_INPUT_INT_DATA + View.INPUT_NUMBERS_ONLY);
                sc.next();
            }
            if ((EnteredNumber = sc.nextInt()) <= model.getMinBound() ||
                    EnteredNumber >= model.getMaxBound()) {
                view.printMessage(View.WRONG_INPUT_INT_DATA + View.INPUT_INT_LESS_THAN_MAX_BOUND_AND_MORE_THAN_MIN_BOUND);
                continue;
            }
            break;
        }
        return EnteredNumber;
    }

}
