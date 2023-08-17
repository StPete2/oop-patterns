package homework2.test.controller.impl;

import homework2.test.controller.IUserControlFactory;
import homework2.test.controller.UserController;

public class UserControllerFactory implements IUserControlFactory {

//    @Override
//    public Calculable create(double primaryArg) {
//        return new Calculator(primaryArg);
//    }

    @Override
    public UserController create() {
        return new UserController();
    }
//    @Override
//    public IUserControlFactory create() {
//        return new UserControllerFactory();
//    }
}
