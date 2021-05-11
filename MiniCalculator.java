import java.util.Scanner;

public class MiniCalculator{
    public static void main (String[] args){
        int x;
        int y;

        Scanner input = new Scanner(System.in); //Function for input;
        System.out.println("Enter first number");
        x = input.nextInt();
        System.out.println("Enter second number");
        y= input.nextInt();

        int sum = x + y;
        int sub = x - y;
        int mult = x * y;
        int div = x / y;
        int mod = x % y;

   System.out.println("The sum is " +sum);
   System.out.println("The subtraction is " +sub);
   System.out.println("The multiplication is " +mult);
   System.out.println("The division is " +div);
   System.out.println("The modulus is " +mod);

    }


}
