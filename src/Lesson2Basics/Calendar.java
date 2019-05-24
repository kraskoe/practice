package Lesson2Basics;

import java.util.Scanner;

public class Calendar {
    static int d, m, y;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите день:");
        d = input.nextInt();
        System.out.println("Введите месяц:");
        m = input.nextInt();
        System.out.println("Введите год:");
        y = input.nextInt();
        getNextDate();
    }

    static void getNextDate() {
        System.out.printf("%02d.%02d.%d",getNextDay(), getNextMonth(), + getNextYear());
    }

    static boolean isLeapYear() {
        if (y % 100 == 0) {
            if (y % 400 == 0) {
                return true;
            } else return false;
        } else if (y % 4 == 0) {
            return true;
        } else return false;
    }

    static int getNextDay () {
        int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (isLeapYear()) {
            if (m == 2) {
                if (d + 1 <= daysInMonths[m-1] + 1) {
                    return d+1;
                } else {
                    return 1;
                }
            }
        }
        if (d + 1 <= daysInMonths[m-1]) {
            return d+1;
        } else {
            return 1;
        }
    }

    static int getNextMonth () {
        if (getNextDay() == 1) {
            if (m == 12) {
                return 1;
            } else {
                return m + 1;
            }
        } else {
            return m;
        }
    }

    static int getNextYear () {
        if (getNextMonth() == 1) {
            return y + 1;
        } else {
            return y;
        }
    }
}
