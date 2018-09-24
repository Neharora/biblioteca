package controller;

import controller.Command.LoginCommand;
import controller.Command.Quit;
import model.Library;
import view.InputDriver;
import view.OutputDriver;

import static model.ItemType.BOOK;

public enum MenuBeforeLogin {
    LOGIN {
        @Override
        public void proceed(OutputDriver outputDriver, Library library, InputDriver inputDriver) {
            new LoginCommand().action(outputDriver, library, inputDriver, BOOK);
        }
    },
    QUIT {
        @Override
        public void proceed(OutputDriver outputDriver, Library library, InputDriver inputDriver) {
            new Quit().action(outputDriver, library, inputDriver, BOOK);
        }
    };

    public void proceed(OutputDriver outputDriver, Library library, InputDriver inputDriver) {
    }

}
