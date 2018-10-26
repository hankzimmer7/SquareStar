package com.hankzimmer;

public class Main {

    public static void main(String[] args) {
        printSquareStar(2);
    }

    //Method prints a square consisting of stars
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }
        //Outer loop goes from top to bottom
        for (int i = 1; i <= number; i++) {
            //Inner loop goes from left to right
            for (int j = 1; j <= number; j++) {
                char output = ' ';
                if (i == 1 || i == number || j == 1 || j == number || i == j || (j == number - i + 1)) {
                    output = '*';
                }
                System.out.print(output);
            }
            System.out.println();
        }
    }
}
