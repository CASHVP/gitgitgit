package lesson2;

import java.util.Scanner;

public class dz9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cifra = 0;
        int reversed = 0;

        while (n > 0) {
            cifra=n%10;
            reversed = reversed * 10 + cifra;
            n/=10;
        }
        System.out.println(reversed);
    }
}