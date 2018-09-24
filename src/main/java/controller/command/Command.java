package controller.command;

import model.ItemType;
import model.Library;
import view.InputDriver;
import view.OutputDriver;

public interface Command {
    void action(OutputDriver outputDriver, Library library, InputDriver driver, ItemType book);
}
