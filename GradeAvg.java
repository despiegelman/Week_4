import java.util.*;
public class GradeAvg {
    public static void main(String[]args){
        int grade1;
        int grade2;
        int grade3;
        int grade4;
        int grade5;
        Scanner input = new Scanner(System.in);
        System.out.print("Type in five grades seperated by spaces: ");
        grade1 = input.nextInt();
        grade2 = input.nextInt();
        grade3 = input.nextInt();
        grade4 = input.nextInt();
        grade5 = input.nextInt();
        input.close();
        System.out.println("Your average is: " + (grade1+grade2+grade3+grade4+grade5)/5);
    }
}
