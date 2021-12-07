import java.util.Scanner;
class A5{
    public static void main(String [] args){

        Scanner A = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        double a= A.nextDouble();
        System.out.println("the value of a b4 adding is: "+ a);
        System.out.print("Enter value of b: ");
        double b= A.nextDouble();
        a+=b;
        System.out.println("the value of a after adding is: "+ a);
    }
}