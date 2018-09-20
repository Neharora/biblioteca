package view;

import java.util.Scanner;

public class InputDriver {
    public int askChoice() {
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        return choice;
    }
}
