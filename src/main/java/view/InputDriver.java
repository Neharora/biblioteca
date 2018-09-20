package view;

import java.util.Scanner;

public class InputDriver {
    public int askChoice() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}
