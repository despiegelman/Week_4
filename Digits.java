public class Digits {
    public static void main(String[]args){
        int number;
        number = 456;
        int num1 = (number-(number%100));
        int num2 = (number-num1-(number%10));
        int num3 = (number-num1-num2);
        System.out.println("The hundreds-place digit is: " + (num1/100));
        System.out.println("The tens-place digit is: " + (num2/10));
        System.out.println("The ones-place digit is: " + (num3));
    }
}
