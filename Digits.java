public class Digits {
    public static void main(String[]args){
        int number;
        number = 258;
        System.out.println("The hundreds-place is: " + (number-(number%100))/100);
    }
}
