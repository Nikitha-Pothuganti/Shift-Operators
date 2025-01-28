import java.util.*;
public class Shiftoperators {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);{
        System.out.println("Enter an integer: ");
        int number=scanner.nextInt();
        int leftshift=number<<1;
        System.out.println("Enter an integer: ");
        int number1=scanner.nextInt();
        int rightshift=number1>>1;
        System.out.println("The result for leftshift is: "+leftshift);
        System.out.println("The resut for rightshift is: "+rightshift);
        System.out.println("Examples:- ");      
        System.out.println((128>>1));
        System.out.println((5<<1));
        scanner.close();
        }
    }
}

