package lesson2;

import java.util.Scanner;

public class dz11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;

        while (n > i) {
            System.out.println(i);
            i=i*2;
        }
    }
}