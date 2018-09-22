package controller;

import controller.Command.CheckInList;
import controller.Command.CheckOutList;
import controller.Command.PrintList;
import controller.Command.Quit;
import model.Library;
import view.InputDriver;
import view.OutputDriver;

import static model.ItemType.BOOK;
import static model.ItemType.MOVIE;

enum Menu {
    PRINT_BOOKS {
        @Override
        public boolean proceed(OutputDriver outputDriver, Library library, InputDriver inputDriver) {
            new PrintList().action(outputDriver, library, inputDriver, BOOK);
            return false;
        }
    },
    PRINT_MOVIES {
        @Override
        public boolean proceed(OutputDriver outputDriver, Library library, InputDriver inputDriver) {
            new PrintList().action(outputDriver, library, inputDriver, MOVIE);
            return false;
        }
    },

    CHECKOUT_BOOKS {
        @Override
        public boolean proceed(OutputDriver outputDriver, Library library, InputDriver inputDriver) {
            outputDriver.print("Enter Book Name : ");
            new CheckOutList().action(outputDriver, library, inputDriver, BOOK);
            return false;
        }
    },
    CHECK_IN_BOOK {
        @Override
        public boolean proceed(OutputDriver outputDriver, Library library, InputDriver inputDriver) {
            outputDriver.print("Enter Book Name : ");
            new CheckInList().action(outputDriver, library, inputDriver, BOOK);
            return false;
        }
    },
    CHECKOUT_MOVIES {
        @Override
        public boolean proceed(OutputDriver outputDriver, Library library, InputDriver inputDriver) {
            outputDriver.print("Enter Movie Name : ");
            new CheckOutList().action(outputDriver, library, inputDriver, MOVIE);
            return false;
        }
    },
    CHECK_IN_MOVIES {
        @Override
        public boolean proceed(OutputDriver outputDriver, Library library, InputDriver inputDriver) {
            outputDriver.print("Enter Movie Name : ");
            new CheckInList().action(outputDriver, library, inputDriver, MOVIE);
            return false;
        }
    },
    QUIT {
        @Override
        public boolean proceed(OutputDriver outputDriver, Library library, InputDriver inputDriver) {
            new Quit().action(outputDriver, library, inputDriver, BOOK);
            return true;
        }
    };

    public abstract boolean proceed(OutputDriver outputDriver, Library library, InputDriver inputDriver);
}
