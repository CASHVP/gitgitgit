package lesson2;

import java.util.Scanner;

public class dz4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        boolean seven = false;

        while (n > 0) {
            int a = n % 10;
            if (a == 7) {
                seven = true;
                break;
            } else {
                n /= 10;
                i++;
            }
        }
        System.out.println(seven ? "yes" : "no");
    }
}






