import java.util.*;
public class DivandMod {
    public static void main(String[] args) {
        int integer1;
        int integer2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        integer1 = input.nextInt();
        System.out.print("Enter the second number: ");
        integer2 = input.nextInt();
        input.close();
        System.out.println(integer1 + " / " + integer2 + " = " + (integer1/integer2));
        System.out.println(integer1 + " % " + integer2 + " = " + (integer1%integer2));
        System.out.println("\n" + integer2 + " / " + integer1 + " = " + (integer2/integer1));
        System.out.println(integer2 + " % " + integer1 + " = " + (integer2%integer1));
    }

}
