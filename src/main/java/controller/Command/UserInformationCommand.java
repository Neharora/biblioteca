package controller.Command;

import model.ItemType;
import model.Library;
import view.InputDriver;
import view.OutputDriver;

public class UserInformationCommand implements Command {
    @Override
    public void action(OutputDriver outputDriver, Library library, InputDriver driver, ItemType book) {
        System.out.println(library.getInformationAboutCurrentUser());
    }
}
