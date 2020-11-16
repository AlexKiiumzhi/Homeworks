import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class ModelTest {

    @Test
    public void setChosenValueTest() {
        int[] num = new int[101];
        Model model = new Model();
        model.setInitialBarrier(0,100);
        for (long i=0; i < 10000; i++) {
            model.setChosenValue();
            int number = model.getChosenValue();
            if (number < model.getMinBound())
                Assertions.fail("setChosenValue Test Failed (out of minRange)");
            if (number > model.getMaxBound())
                Assertions.fail("setChosenValue Test Failed (out of maxRange)");
            num[number]++;
        }
        for (int i = 1; i <= 99; i++) {
            System.out.println(i+": " + num[i]);
        }
    }

    @Test
    public void checkEnteredNumberTest() {
        Model model = new Model();
        Random rand = new Random();
        model.setInitialBarrier(0,100);
        model.setChosenValue();
        int chosenValue = model.getChosenValue();
        int enteredNumber = rand.nextInt(model.getMaxBound() - model.getMinBound());
        for (long i=0; i < 10000; i++) {
            if (!model.checkEnteredNumber(enteredNumber)) {
                if (chosenValue != enteredNumber)
                    Assertions.fail("Test Failed");
            } else {
                if (chosenValue == enteredNumber)
                    Assertions.fail("Test Failed");
            }
        }
    }
}
