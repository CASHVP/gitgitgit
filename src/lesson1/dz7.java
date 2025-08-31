package lesson1;

import java.util.Scanner;

public class dz7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("vvedite symbol");
        int ch = sc.next().charAt(0);

        ch = sc.next().charAt(0);

        if (90 >= ch && ch >= 65) {
            System.out.println("UPPer");
        } else {
            System.out.println("lower");

        }


    }
}
