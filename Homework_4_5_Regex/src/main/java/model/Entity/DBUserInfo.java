package model.Entity;

import java.util.HashSet;
import java.util.Set;

public class DBUserInfo {

    private final Set<User> userSet = new HashSet<>();

    public DBUserInfo() {
        this.userSet.add(new User("David","Dave1995","380957893217", "David@gmail.com"));
        this.userSet.add(new User("Alexander","alex14","380963214788","Alexander@gmail.com"));
        this.userSet.add(new User("Joseph","joe123","3809845645645", "Joe@gmail.com"));
    }

    public boolean checkLogin (String email){
        for (User user : userSet){
            if (user.getEmail().equals(email)){
                return true;
            }
        }
        return false;
    }

/*    public boolean addNoteToDb(Note note) throws SQLException {
        if (noteSet.stream().anyMatch(
                elem -> elem.getNickName().equals(note.getNickName()))) {
            throw new SQLException("Such nickname already exists in DB.");
        }
        return noteSet.add(note);
    }*/

    public Set<User> getUserSet() {
        return userSet;
    }
}
