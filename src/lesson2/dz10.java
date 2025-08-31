package lesson2;

import java.util.Scanner;

public class dz10 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        boolean notSimple = false;

        while (n>i){
            if (n%i==0){
                notSimple=true;

            }i++;

        }
        System.out.println(notSimple? "No":"Yes");
    }
}
