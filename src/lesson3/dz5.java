package lesson3;

import java.util.Scanner;

public class dz5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //кол-во чисел
        int positiveCoun=0 ;   //  счетчик
        System.out.println("Введите " + n + " целых чисел:");

        for (int i = 0; i < n; i++){
            int num = sc.nextInt();
            if (num > 0) {
                positiveCoun++;
            }
        }
        System.out.println("Количество положительных чисел: " + positiveCoun);


    }
}