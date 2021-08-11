package hometask11;

import java.util.Scanner;

public class hometask14 {
    // Задано число. Определить, близко ли к нему другое введенное число (в пределах 10%).
    public static void main(String[] args) {
        System.out.println("Enter a value");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            System.out.println("Enter b value");
            int b = sc.nextInt();
            if (a % b <= a / 10) {
                System.out.println("b is close to a");
            } else {
                System.out.println("b is far from a");
            }
        }
    }
}
