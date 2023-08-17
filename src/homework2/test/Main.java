package homework2.test;

import homework2.test.controller.IUserControlFactory;
import homework2.test.controller.impl.UserControllerFactory;
//import homework2.test.model.decorator.CalculableWithLoggerFactory;
import homework2.test.view.UserView;

public class Main {
    public static void main(String[] args) {
        IUserControlFactory userControllerFactory = new UserControllerFactory();
//        IUserControlFactory userControllerFactory = new CalculableWithLoggerFactory();
        UserView view = new UserView(userControllerFactory);
        view.run();
    }
}
