package lesson1;

import javax.management.IntrospectionException;
import javax.management.MBeanAttributeInfo;
import java.util.Scanner;

public class DZ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1)vvedite slovo");
        String a = sc.nextLine();
        System.out.println("2)vvedite slovo");
        String b=sc.nextLine();

        if (a.equalsIgnoreCase(b)) {
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }
    }
}
