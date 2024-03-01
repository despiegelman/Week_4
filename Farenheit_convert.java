import java.util.*;
public class Farenheit_convert {
    public static void main(String[] args) {
        double farenheit;
        Scanner input = new Scanner(System.in);
        System.out.print("Insert the degrees in farenheit here: ");
        farenheit = input.nextDouble();
        input.close();
        System.out.println(farenheit + " degrees farenheit is equal to " + 5.0 / 9 * (farenheit - 32) + " degrees celsius");
    }
}
