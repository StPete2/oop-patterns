package homework1.view;

import homework1.controller.IUserControlFactory;
import homework1.controller.UserController;
import homework1.model.Calculable;

public class UserView {

    private final IUserControlFactory userControlFactory;

    public UserView(IUserControlFactory userControllerFactory) {
        this.userControlFactory = userControllerFactory;
    }

    public void run(){
        while (true){
            UserController userController = userControlFactory.create();
            double primaryArg = userController.parseDouble(userController.scan("Введите первый аргумент: "));
            Calculable calculator = userController.create(primaryArg);
            while (true){
                String command = userController.scan("Введите команду (+, *, /, =) : ");
                if (command.equals("+")){
                    double arg = userController.parseDouble(userController.scan("Введите второй аргумент: "));
                    userController.sum(arg);
                    continue;
                }
                if (command.equals("*")){
                    double arg = userController.parseDouble(userController.scan("Введите второй аргумент: "));
                    userController.multiply(arg);
                    continue;
                }
                if (command.equals("/")){
                    double arg = userController.parseDouble(userController.scan("Введите второй аргумент: "));
                    userController.divide(arg);
                    continue;
                }
                if (command.equals("=")){
                    double result = userController.getResult();
                    System.out.printf("Результат %f\n", result);
                    break;
                }
            }
            String command = userController.scan("Ещё посчитать? (Y/N): ");
            if (command.equalsIgnoreCase("y")){
                continue;
            }
            break;
        }
    }
}
