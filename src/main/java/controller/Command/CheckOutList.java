package controller.Command;

import model.ItemType;
import model.Library;
import view.InputDriver;
import view.OutputDriver;

public class CheckOutList implements Command {
    @Override
    public void action(OutputDriver outputDriver, Library library, InputDriver driver, ItemType itemType) {
        String bookToCheckout = driver.askForItemName();
        outputDriver.print(library.removeItemFromList(bookToCheckout, itemType));
    }
}
