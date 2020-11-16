package model.Entity;

import model.Entity.User;

import java.util.ArrayList;
import java.util.List;

public class UsersInfo {

    private DBUserInfo dbUserInfo = new DBUserInfo();

    public void addNewUserToUsersInfo(String firstName, String nickName, String phoneNumber,
                                      String email) throws NotUniqueEmailException {
        if (dbUserInfo.checkLogin(email)){
            throw new NotUniqueEmailException(email);
        }else{
        User user = new User(firstName,nickName,phoneNumber, email);
        dbUserInfo.getUserSet().add(user);
        }
    }

    @Override
    public String toString() {
        return dbUserInfo.getUserSet().toString();
    }
}
