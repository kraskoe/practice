package Lesson2Basics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class houseDeployment {
    static int a, b, c, d;
    static int e = 90, f = 30;
    public static void main(String[] args) {
        inputHouseSizes();
        if (checkHouseDeployment()) {
            System.out.println("These houses can be placed on the plot");
        } else {
            System.out.println("These houses can NOT be placed on the plot");
        }
    }

    static void inputHouseSizes () {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter the length of the 1st house:");
        try {
            a = sc.nextInt();
            if (a <= 0) {
                System.out.println("You must enter a positive integer number");
                inputHouseSizes();
            }
        }
        catch (InputMismatchException imex){
            System.out.println("You must enter a positive integer number");
            inputHouseSizes();
        }

        System.out.println("Please, enter the width of the 1st house:");
        try {
            b = sc.nextInt();
            if (b <= 0) {
                System.out.println("You must enter a positive integer number");
                inputHouseSizes();
            }
        }
        catch (InputMismatchException imex){
            System.out.println("You must enter a positive integer number");
            inputHouseSizes();
        }

        System.out.println("Please, enter the length of the 2nd house:");
        try {
            c = sc.nextInt();
            if (c <= 0) {
                System.out.println("You must enter a positive integer number");
                inputHouseSizes();
            }
        }
        catch (InputMismatchException imex){
            System.out.println("You must enter a positive integer number");
            inputHouseSizes();
        }

        System.out.println("Please, enter the width of the 2nd house:");
        try {
            d = sc.nextInt();
            if (d <= 0) {
                System.out.println("You must enter a positive integer number");
                inputHouseSizes();
            }
        }
        catch (InputMismatchException imex){
            System.out.println("You must enter a positive integer number");
            inputHouseSizes();
        }
    }

    static boolean checkHouseDeployment (){
        if ((((a + c) <= e) && ((b + d) <= f)) || (((a + d) <= e) && ((b + c) <= f))) {
            return true;
        } else {
            return false;
        }
    }
}
