package lesson3;

import java.util.Scanner;

public class dz1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int n = sc.nextInt();
        int sum=0;

        for (int i = 0; i <= n; i++) {
            sum+=i;

        }
        System.out.println(sum);


    }
}