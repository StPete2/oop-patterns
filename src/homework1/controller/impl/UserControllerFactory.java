package homework1.controller.impl;

import homework1.controller.IUserControlFactory;
import homework1.controller.UserController;

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
