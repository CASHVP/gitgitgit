package lesson2;

import java.util.Scanner;

public class dz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("vvedite chislo");
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println((int) Math.log10(n) + 1);
        } else {
            System.out.println("not found");

        }


    }
}









