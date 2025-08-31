package lesson2;

import java.util.Scanner;

public class dz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int schetchik=1;
        int sum=0;

        while (schetchik<=n){
            sum=sum+schetchik;
            schetchik++;
        }
        System.out.println(sum);

    }
}




