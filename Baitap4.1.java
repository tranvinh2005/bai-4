package baitap4.pkg1;

import java.util.Random;
import java.util.Scanner;

public class Baitap41 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("nhap a ");
        int a = keyboard.nextInt();
        if (a >= 90) {
            System.out.println("you got an a !");
        }
        if (a >= 80) {
            System.out.println("you got an b !");
        }
        if (a >= 70) {
            System.out.println("you got an c !");
        }
        if (a >= 60) {
            System.out.println("you got an d !");
        }
        if (a < 50) {
            System.out.println("you got an f !");
        }
        int c = keyboard.nextInt();
        if (c > 0) {
            System.out.println("positivi");
        } else if (c < 0) {
            System.out.println("Nigative");
        } else {
            System.out.println("zero");
        }
        int b = keyboard.nextInt();
        if (b == 1) {
            System.out.println("gorl medal!");
        } else if (b == 2) {
            System.out.println("silver medal");
        } else if (b == 3) {
            System.out.println("branze medal");
        }
        System.out.println("nhap n");
        int n = keyboard.nextInt();
        switch (n) {
            case 5:
                System.out.println("five\n");
                break;
            case 4:
                System.out.println("four\n");
                break;
            case 3:
                System.out.println("three\n");
                break;
            case 2:
                System.out.println("two\n");
                break;
            case 1:
                System.out.println("one\n");
                break;
            default:
                System.out.println("no\n");
        }
        for (int i = 1; i <= 4; i++) {
            System.out.println("i am so murt");
        }
        for (int i = 1; i <= 6; i++) {
            System.out.println(+i);
        }
        System.out.print("T-minus ");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + ", ");
        }
        System.out.println("blastoff!");
        System.out.println("The end.");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int sum = 0;
        int number = 1;

        while (number != 0) {
            System.out.print("Enter a number (0 to quit): ");
            number = keyboard.nextInt();
            sum = sum + number;
        }
        System.out.println("The total is " + sum);
        String phrase;
        do {
            System.out.print("Type your password: ");
            phrase = keyboard.next();
        } while (!phrase.equals("duytan"));
        Random rand = new Random();
        int r = rand.nextInt(3);
        if (r == 0) {
            System.out.println("Rock");
        } else if (r == 1) {
            System.out.println("Paperr");
        } else { 
            System.out.println("Scissors");
        }
    }
}
