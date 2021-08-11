/*
Задано целое число. Определить, какой день недели соответствует заданному числу и вывести в консоль.
Если ни одному - вывести соответствующее сообщение.
 */
package hometask11;

import java.util.Scanner;

public class hometask11 {
    public static void main(String[] args) {
        System.out.println("Enter day Number");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int dayNumber = sc.nextInt();
            switch (dayNumber) {
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
                case 7 -> System.out.println("Sunday");
                default -> System.out.println("There is no day with such number");
            }
        }
    }
}

