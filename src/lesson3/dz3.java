package lesson3;

import java.util.Scanner;

public class dz3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long result = 1;

        for (int i = 1; i <= num; i++) {
            result = result * i;

        }
        System.out.println(result);
    }
}
