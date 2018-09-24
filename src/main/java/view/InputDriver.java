package view;

import java.util.Scanner;

public class InputDriver {
    public int askIntegerChoice() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public String askInputAsString() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}
