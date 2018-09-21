package controller;

enum Menu {
    PRINT_BOOKS {
        @Override
        public boolean proceed(LibraryController libraryController) {
            libraryController.printListOfBooks();
            return false;
        }
    },
    CHECKOUT {
        @Override
        public boolean proceed(LibraryController libraryController) {
            libraryController.removeBook();
            return false;
        }
    },
    CHECK_IN {
        @Override
        public boolean proceed(LibraryController libraryController) {
            libraryController.addBook();
            return false;
        }
    },
    QUIT {
        @Override
        public boolean proceed(LibraryController libraryController) {
            return true;
        }
    };

    public abstract boolean proceed(LibraryController libraryController);
}
