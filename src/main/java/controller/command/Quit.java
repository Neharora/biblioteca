package controller.command;

import model.ItemType;
import model.Library;
import view.InputDriver;
import view.OutputDriver;

public class Quit implements Command {
    @Override
    public void action(OutputDriver outputDriver, Library library, InputDriver driver, ItemType book) {
        return;
    }
}
