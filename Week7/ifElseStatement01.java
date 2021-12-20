package Week7;
import java.util.Scanner;
public class ifElseStatement01 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter username : ");
     
        int username = kb.nextInt();
        System.out.print("Enter password : ");
        int password = kb.nextInt();

        if (username == 123 && password == 1234) {
         System.out.println("You're logged in.");
        } else {
         System.out.println("Sorry, username or password is incorrect.");
        }
        
        
        
            //char gender = 'b';

        //if (gender=='b') {
            //System.out.println("Boy");
        //} else {
            //System.out.println("Girl");
       // }
    }
}
