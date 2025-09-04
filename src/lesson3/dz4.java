package lesson3;

import java.util.Scanner;

public class dz4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int n = sc.nextInt();
        double sum = 0;

        for (int i = 1; i <= n; i++) {

            System.out.println("Введите числа: " + i);
            int N = sc.nextInt();
            sum += N;

        }
        System.out.println("Среднее : " +sum/n);

    }
}

