package controller;

import model.Entity.NotUniqueEmailException;
import model.Entity.UsersInfo;
import view.View;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Controller {
    private final View view;
    private final UsersInfo usersInfo;
    private final String firstNameRegex;
    private final String nickNameRegex;
    private final String phoneNumberRegex;
    private final String emailRegex;


    public Controller(View view, UsersInfo usersInfo) {
        this.usersInfo = usersInfo;
        this.view = view;
        ResourceBundle regexBundle = ResourceBundle.getBundle("regex", Locale.forLanguageTag("en"));     //"en"
        firstNameRegex = regexBundle.getString("first.name.regex.regexp");
        nickNameRegex = regexBundle.getString("nickname.regex.regexp");
        phoneNumberRegex = regexBundle.getString("phone.number.regex.regexp");
        emailRegex = regexBundle.getString("email.regex.regexp");
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);


            view.printMessage("enter.name", firstNameRegex);
            String firstName = checkInputWithRegex(sc, firstNameRegex, view);

            view.printMessage("enter.nickname", nickNameRegex);
            String nickName = checkInputWithRegex(sc, nickNameRegex, view);

            view.printMessage("enter.phone.number", phoneNumberRegex);
            String phoneNumber = checkInputWithRegex(sc, phoneNumberRegex, view);

            while (true) {
            view.printMessage("enter.email", emailRegex);
            String email = checkInputWithRegex(sc, emailRegex, view);

            try {
                usersInfo.addNewUserToUsersInfo(firstName, nickName, phoneNumber, email);
            } catch (NotUniqueEmailException e) {
                e.printStackTrace();
                System.out.println("Email is already taken! Try again " + e.getEmail());
                continue;
            }
            view.printString(usersInfo.toString());
            break;
        }
    }
    private String checkInputWithRegex(Scanner sc, String regex, View view) {
        String input = null;

        while (!(sc.hasNext() && (input = sc.next()).matches(regex))) {
            view.printMessage("wrong.input", regex);
        }
        return input;
    }
}
