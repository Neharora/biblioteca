package controller.command;

import controller.Menu;
import model.*;
import view.InputDriver;
import view.OutputDriver;

import static main.Constants.*;

public class LoginCommand implements Command {
    @Override
    public void action(OutputDriver outputDriver, Library library, InputDriver driver, ItemType book) {
        outputDriver.print(ENTER_USER_DETAILS);
        int userId = driver.askIntegerChoice();
        String password = driver.askInputAsString();
        int choice;
        User currentUser = new User(new UserId(userId), new UserPassword(password), null).validate(library.userList);
        if (currentUser != null) {
            library.loginUser(currentUser);
            do {
                outputDriver.print(MENU_WITH_LOGIN);
                choice = driver.askIntegerChoice() - 1;
                if (choice >= 0 && choice < Menu.values().length) {
                    Menu.values()[choice].proceed(outputDriver, library, driver);
                } else {
                    outputDriver.print(RE_ENTER_YOUR_CHOICE);
                }
            } while (choice != 7);
        } else {
            outputDriver.print(INVALID_USER);
        }
    }
}
