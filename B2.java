import java.util.Scanner;
class B2{
    public static void main(String [] args){
        Scanner B = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double Quize= B.nextDouble();
        
        System.out.print("Enter value of b: ");
        double Midterm= B.nextDouble();

        System.out.print("Enter value of c: ");
        double Final= B.nextDouble();
        double sum=(Quize + Midterm + Final);
        double avg=sum/3;
        System.out.println("Average score is: " + avg);

        if (avg>=90)
        System.out.println("Grade is:  A ");

        else if (avg>=70 && avg<90)
        System.out.println("Grade is: B");

        else if (avg>-50 && avg<70)
        System.out.println("Grade is: C");

        else 
        System.out.println("Grade is: F");





    }
}