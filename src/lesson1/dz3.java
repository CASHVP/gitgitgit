package lesson1;

import java.util.Scanner;

public class dz3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("vvedite chiclo a");
        a = sc.nextInt();
        System.out.print("vvedite chiclo b");
        b = sc.nextInt();
        System.out.print("vvedite chiclo c");
        c = sc.nextInt();

        if (a < b && a < c) {
            System.out.println(a);
        } else if (b < a && a < c) {
            System.out.println(b);
        } else if (a < b && c < a);
        System.out.println(c);



    }
}


