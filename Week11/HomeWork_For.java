package Week11;

import java.util.Scanner;

public class HomeWork_For {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int num,sum=1;
        System.out.print("Enter Number");
        num = kb.nextInt();
        System.out.print(num+"! = ");
        for (int i=num;i>=1;i--){
           System.out.print(i+"*");
        }
            System.out.print(" = "+sum);
    }

}