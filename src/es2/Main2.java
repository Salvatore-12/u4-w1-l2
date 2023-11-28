package es2;


import java.util.Scanner;

public class Main2 {
    public static void switchNumber (int number) {
        switch (number) {
            case 0 :
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Due");
                break;
            case 3:
                System.out.println("Tre");
                break;
            default:
                System.err.println(("Error"));
        }
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero tra 0 e 3: ");
        int number = scanner.nextInt();

        switchNumber(number);
        scanner.close();
    }

}
