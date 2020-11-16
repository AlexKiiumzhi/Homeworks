import controller.Controller;
import model.Entity.UsersInfo;
import view.View;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new View(), new UsersInfo());

        controller.processUser();
    }
}
