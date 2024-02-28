import java.util.*;
public class Digits_revised {
    public static void main(String[]args){
        int number;
        int num1;
        int num2;
        int num3;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        number = input.nextInt();
        num1 = (number-(number%100));
        num2 = (number-num1-(number%10));
        num3 = (number%10);
        System.out.println("The hundreds-place digit is: " + (num1/100));
        System.out.println("The tens-place digit is: " + (num2/10));
        System.out.println("The ones-place digit is: " + (num3));
    }
}
