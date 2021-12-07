import java.util.Scanner;
class B1{
    public static void main(String [] args){
        Scanner B = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a= B.nextDouble();
        
        System.out.print("Enter value of b: ");
        double b= B.nextDouble();

        System.out.print("Enter value of c: ");
        double c= B.nextDouble();

        if(a>b){
            if (a>c)
            System.out.println(a + "is greater");
            else
            System.out.println(c + "is greater");

        }
        else{
            if (b>c)
            System.out.println(b + "is greater");
            else
            System.out.println(c + "is greater");

        }






    }
}        