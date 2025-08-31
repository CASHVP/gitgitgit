package lesson1;

import java.util.Scanner;

public class dz11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b;
        System.out.println("katet1 ");
        a = sc.nextDouble();
        System.out.println("katet2 ");
        b = sc.nextDouble();
        double c = Math.sqrt((a * a) + (b * b));
        System.out.printf("%.3f",c);

    }
}
