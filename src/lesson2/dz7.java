package lesson2;

import java.util.Scanner;

public class dz7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("vvedite chislo >1: ");
        int n = sc.nextInt();
        int i = 2;

        while (i <= n) {
            if (n % i == 0) ;
            break;
        }
        i++;
        if (i != -1) ;
        System.out.println("Наименьший делитель числа " + n + " — это " + i);
    }
}




