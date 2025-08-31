package lesson2;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class dz6 {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        int n;
        int sum=0;

        do{
            n=sc.nextInt();
            sum=sum+n;
        }while (n!=0);
        System.out.println(sum);
        }
}


