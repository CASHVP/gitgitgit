package lesson2;

import java.util.Scanner;

public class dz12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;

        while (n >= i) {
            if (i % 7 == 0) {
                continue;
            }
            i++;

        }
        System.out.println(n);


    }
}
