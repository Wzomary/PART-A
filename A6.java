import java.util.Scanner;
class A6{
    public static void main(String [] args){

        Scanner A = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        double a= A.nextDouble();
        
        System.out.print("Enter value of b: ");
        double b= A.nextDouble();
        
        System.out.println("the result of adding is: "+(a+b));
        System.out.println("the result of substraction is: "+(a-b));
        System.out.println("the result of multiplication is: "+(a*b));
        System.out.println("the result of division is: "+(a/b));
    }
}