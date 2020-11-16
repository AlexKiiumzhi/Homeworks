

public class View {

    public static final String INPUT_FIRST_WORD = "Input First Word = ";
    public static final String INPUT_SECOND_WORD = "Input Second Word = ";
    public static final String WRONG_INPUT_LINE = "Wrong input! Repeat please! ";
    public static final String THE_LINE = "Line is : ";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessageAndInt(String message, String value1, String value2 ){
        System.out.println(message + value1 + " " + value2);
    }

}
