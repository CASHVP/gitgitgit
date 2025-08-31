package lesson2;

import java.util.Scanner;

public class dz8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int even = 0;
        int odd = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                even++;
            }
            if (n % 2 == 1) {
                odd++;
            }
            n /= 10;
        }
        System.out.println("even " + even);
        System.out.println("odd " + odd);
    }
}



