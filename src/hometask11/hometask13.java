package hometask11;

import java.util.Scanner;

public class hometask13 {
    /*
    Заданы три числа. Найти среди них минимальное, максимальное и среднее арифметическое и вывести.
    Без использования дополнительных библиотек, только операторы сравнения и логические.
     */
    public static void main(String[] args) {
        System.out.println("Enter a value");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        System.out.println("Enter b value");
        float b = sc.nextFloat();
        System.out.println("Enter c value");
        float c = sc.nextFloat();
        if (a > b) {
            if (b > c) {
                System.out.println("Max num is " + a);
                System.out.println("Min num is " + c);
            } else if (c > a) {
                System.out.println("Max num is " + c);
                System.out.println("Min num is " + b);
            } else {
                System.out.println("Max num is " + a);
                System.out.println("Min num is " + b);
            }
        } else if (b > a) {
            if (a > c) {
                System.out.println("Max num is " + b);
                System.out.println("Min num is " + c);
            } else if (c > b) {
                System.out.println("Max num is " + c);
                System.out.println("Min num is " + a);
            } else {
                System.out.println("Max num is " + b);
                System.out.println("Min num is " + a);
            }
        }
        float arithMean = 0;
        System.out.println("arithMean = " + (a + b + c) / 3);
    }
}

