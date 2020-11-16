package view;

import java.util.Locale;
import java.util.ResourceBundle;

public class View {
    private final ResourceBundle messagesBundle;

    //only en
    public View() { messagesBundle = ResourceBundle.getBundle("messages", Locale.forLanguageTag("en")); }

    public void printString(String string) {
        System.out.println(string);
    }

    public void printMessage(String message, String regexPattern) {
        System.out.println(this.messagesBundle.getString(message) + " " + regexPattern);
    }
}
