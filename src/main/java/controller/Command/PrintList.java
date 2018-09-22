package controller.Command;

import model.ItemType;
import model.Library;
import view.InputDriver;
import view.OutputDriver;

public class PrintList implements Command {
    @Override
    public void action(OutputDriver outputDriver, Library library, InputDriver driver, ItemType itemType) {
        String HORIZONTAL_LINE = " ====================================================================";
        outputDriver.print(HORIZONTAL_LINE);
        library.getList(itemType).forEach(outputDriver::print);
        outputDriver.print("\n" + HORIZONTAL_LINE + "\n");
    }
}
