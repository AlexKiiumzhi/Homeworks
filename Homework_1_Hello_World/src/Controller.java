import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void Process() {
        Scanner sc1 = new Scanner(System.in);
        this.model.setValue1(this.inputFirstWordWithScanner(sc1));
        Scanner sc2 = new Scanner(System.in);
        this.model.setValue2(this.inputSecondWordWithScanner(sc2));
        this.view.printMessageAndInt("Line is : ", this.model.getValue1(), this.model.getValue2());
    }

    public String inputFirstWordWithScanner(Scanner sc) {
        String hello = "hello";
        this.view.printMessage("Input First Word = ");

        while(true) {
            String firstWord = sc.nextLine();
            if (firstWord.equals(hello)) {
                return firstWord;
            }

            this.view.printMessage("Wrong input! Repeat please! Input Second Word = ");
        }
    }

    public String inputSecondWordWithScanner(Scanner sc) {
        String world = "world!";
        this.view.printMessage("Input Second Word = ");

        while(true) {
            String secondWord = sc.nextLine();
            if (secondWord.equals(world)) {
                return secondWord;
            }

            this.view.printMessage("Wrong input! Repeat please! Input Second Word = ");
        }
    }
}
