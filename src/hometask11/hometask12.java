/*
Даны два целых числа, задающие три диапазона чисел.
Определить, какому диапазону принадлежит введенное пользователем число.
  */
package hometask11;

import java.util.Scanner;

public class hometask12 {

    public static void main(String[] args) {
        System.out.println("Enter a value");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter b value");
        int b = sc.nextInt();
        System.out.println("Enter c value");
        int c = sc.nextInt();
        // Так как сказано, что диапазона должно быть три, то а не может быть равно b.
        if (a < b) {
            if (c <= a) {
                System.out.println("c<=a<b");
            } else if (c > a && c < b) {
                System.out.println("a<c<b");
            } else if (c >= b) {
                System.out.println("a<b<=c");
            }
        } else if (b < a) {
            if (c <= b) {
                System.out.println("c<=b<a");
            } else if (c > b && c < a) {
                System.out.println("b<c<a");
            } else if (c >= a) {
                System.out.println("b<a<=c");
            }
        } else if (b == a) {
            System.out.println("Incorrect data");
        }
    }
}
