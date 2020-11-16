package model.Entity;

public class User {

    private String firstName;
    private String nickName;
    private String phoneNumber;
    private String email;

    public User(String firstName, String nickName, String phoneNumber, String email) {
        this.firstName = firstName;
        this.nickName = nickName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString() {
        return "\tUser{\n" +
                "\t\tFirst name = " + firstName + '\n' +
                "\t\tNickname = " + nickName + '\n' +
                "\t\tPhone number= " + phoneNumber + '\n' +
                "\t\temail= " + email + '}' +
                '\n';
    }
}
