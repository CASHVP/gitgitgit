package lesson3;

import java.util.Scanner;

public class dz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i += 2) {
            sum += Math.pow(i, 2);
        }
        System.out.println(sum);
    }
}

