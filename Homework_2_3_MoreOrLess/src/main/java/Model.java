import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Model {

    private int minBound ;
    private int maxBound ;
    private int chosenValue;
    private View view;

    private List<Integer> enteredNumbers = new ArrayList<Integer>();

    public void setChosenValue(){
        Random rand = new Random();
        chosenValue = rand.nextInt(maxBound - minBound);

    }

    public boolean checkEnteredNumber (int enteredNumber){
        enteredNumbers.add(enteredNumber);
        if (enteredNumber == chosenValue){
            return false;
        } else if (enteredNumber > chosenValue){
            maxBound = enteredNumber;
            System.out.println("Please choose lower number ");
        } else {
            minBound = enteredNumber;
            System.out.println("Please choose higher number ");

        }
        return true;
    }

    public void setInitialBarrier(int minBarrier, int maxBarrier){
        this.minBound = minBarrier;
        this.maxBound = maxBarrier;
    }

    public int getChosenValue() {
        return chosenValue;
    }
    public int getMinBound() {
        return minBound;
    }
    public int getMaxBound() {
        return maxBound;
    }
    public List<Integer> getEnteredNumbers() {
        return enteredNumbers;
    }

}
