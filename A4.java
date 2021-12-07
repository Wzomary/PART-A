import java.util.Scanner;
class A4{
    public static void main(String [] args){

        Scanner A = new Scanner(System.in);

        System.out.println("Enter ur name then age");
        String name= A.nextLine();
        int age= A.nextInt ();
        System.out.println("Welcome "+ name + "ur age is: " + age);
    }
}