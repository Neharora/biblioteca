package controller;

import controller.Command.*;
import model.Library;
import view.InputDriver;
import view.OutputDriver;

import static model.ItemType.BOOK;
import static model.ItemType.MOVIE;

public enum Menu {
    PRINT_BOOKS {
        @Override
        public void proceed(OutputDriver outputDriver, Library library, InputDriver inputDriver) {
            new PrintList().action(outputDriver, library, inputDriver, BOOK);
        }
    },
    PRINT_MOVIES {
        @Override
        public void proceed(OutputDriver outputDriver, Library library, InputDriver inputDriver) {
            new PrintList().action(outputDriver, library, inputDriver, MOVIE);
        }
    },

    CHECKOUT_BOOKS {
        @Override
        public void proceed(OutputDriver outputDriver, Library library, InputDriver inputDriver) {
            new CheckOutList().action(outputDriver, library, inputDriver, BOOK);
        }
    },
    CHECK_IN_BOOK {
        @Override
        public void proceed(OutputDriver outputDriver, Library library, InputDriver inputDriver) {
            new CheckInList().action(outputDriver, library, inputDriver, BOOK);
        }
    },
    CHECKOUT_MOVIES {
        @Override
        public void proceed(OutputDriver outputDriver, Library library, InputDriver inputDriver) {
            new CheckOutList().action(outputDriver, library, inputDriver, MOVIE);
        }
    },
    CHECK_IN_MOVIES {
        @Override
        public void proceed(OutputDriver outputDriver, Library library, InputDriver inputDriver) {
            new CheckInList().action(outputDriver, library, inputDriver, MOVIE);
        }
    },
    USER_INFORMATION {
        @Override
        public void proceed(OutputDriver outputDriver, Library library, InputDriver inputDriver) {
            new UserInformationCommand().action(outputDriver, library, inputDriver, MOVIE);
        }
    },
    QUIT {
        @Override
        public void proceed(OutputDriver outputDriver, Library library, InputDriver inputDriver) {
            new Quit().action(outputDriver, library, inputDriver, BOOK);
        }
    };

    public abstract void proceed(OutputDriver outputDriver, Library library, InputDriver inputDriver);
}
