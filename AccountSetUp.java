import java.util.*;
public class AccountSetUp {
    public static void main(String[] args) {
        String name;
        String password;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        name = input.nextLine();
        System.out.print("Enter a password: ");
        password = input.nextLine();
        input.close();
        System.out.println("Your name is: " + name);
        System.out.println("Your password is: " + password);
    }
}
