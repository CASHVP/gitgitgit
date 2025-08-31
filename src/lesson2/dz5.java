package lesson2;

import java.util.Scanner;

public class dz5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int i = 1;

        while (i <= 10) {
            System.out.println(m + "x" + i + "=" + m * i);
            i++;
        }
    }
}
