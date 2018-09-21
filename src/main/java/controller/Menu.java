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
    QUIT {
        @Override
        public boolean proceed(LibraryController libraryController) {
            return true;
        }
    },
    DEFAULT {
        @Override
        public boolean proceed(LibraryController libraryController) {
            System.out.println("Re-enter your choice!");
            return false;
        }
    };

    public abstract boolean proceed(LibraryController libraryController);
}
