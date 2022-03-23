package be.intecbrussel.examples;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner kbd = null;
        try {
            System.out.println("Enter value: ");
            kbd = new Scanner(System.in);

            int num = Integer.parseInt(kbd.next());

            System.out.println("Enter next value: ");
            int den = Integer.parseInt(kbd.next());
            int div = num / den;
            System.out.format("%d/%d = %d", num, den, div);
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid input");
        } catch (ArithmeticException ae) {
            System.out.println("Division by 0");
        } finally {
            kbd.close();
            System.out.println();
            System.out.println("The end (good or bad).");
        }

    }


}
