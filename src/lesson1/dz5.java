package lesson1;

import java.util.Scanner;

public class dz5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x,l,r;
        System.out.println("vvedite x");
        x=sc.nextInt();
        System.out.println("vvedite l");
        l=sc.nextInt();
        System.out.println("vvedite r");
        r=sc.nextInt();

        if (l<=r||r<=x) {
            System.out.println("in");
        }else{
            System.out.println("out");
        }
    }
}
