package lesson1;

import java.util.Scanner;

public class dz4 {
    public static void main(String[] args) {
        int w, h;
        Scanner sc = new Scanner(System.in);

        System.out.println("vvedite ctorony w ");
        w = sc.nextInt();
        System.out.println("vvedite ctorony h");
        h = sc.nextInt();

        if (w == h) {
            System.out.println("square");
        } else {
            System.out.println("rectangle");

        }
    }
}
