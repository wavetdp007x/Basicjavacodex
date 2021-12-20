package Week6;
import java.util.Scanner;

public class Bmi_02 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter Weight [kg] : ");
        double weight = kb.nextDouble();
        System.out.print("Enter Height [cm] : ");
        double height = kb.nextDouble();

        height /= 100; // height=height/100;
        double bmi = weight / (height * height);

        System.out.println("Weight = " + weight);
        System.out.println("Height = " + height);
        System.out.println("BMI = " + bmi);
        kb.close();
    }

}
