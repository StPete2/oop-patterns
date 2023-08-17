package homework1;

import homework1.controller.IUserControlFactory;
import homework1.controller.impl.UserControllerFactory;
import homework1.view.UserView;

public class Main {
    public static void main(String[] args) {
        IUserControlFactory userControllerFactory = new UserControllerFactory();
//        IUserControlFactory userControllerFactory = new CalculableWithLoggerFactory();
        UserView view = new UserView(userControllerFactory);
        view.run();
    }
}
