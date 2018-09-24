package controller.command;

import model.ItemType;
import model.Library;
import view.InputDriver;
import view.OutputDriver;

import static main.Constants.ENTER_ITEM_NAME;

public class IssueItem implements Command {
    @Override
    public void action(OutputDriver outputDriver, Library library, InputDriver driver, ItemType itemType) {
        outputDriver.print(ENTER_ITEM_NAME);
        String bookToCheckout = driver.askInputAsString();
        outputDriver.print(library.removeItemFromList(bookToCheckout, itemType));
    }
}
