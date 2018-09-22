package controller.Command;

import model.ItemType;
import model.Library;
import view.InputDriver;
import view.OutputDriver;

public class CheckInList implements Command {
    @Override
    public void action(OutputDriver outputDriver, Library library, InputDriver driver, ItemType itemType) {
        String bookToCheckIn = driver.askForItemName();
        outputDriver.print(library.addItemToList(bookToCheckIn, itemType));
    }
}
