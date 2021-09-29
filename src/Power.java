import java.io.*;
import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        int n,i;
        System.out.println("Welcome to the powers");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of powers:");
        n=sc.nextInt();
        for (i=1;i<=n;i++) {
            int pow=(int)(Math.pow(2,n));
            System.out.println("The power of 2 is: " + pow);
            break;
        }
    }
}


