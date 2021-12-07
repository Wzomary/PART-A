import java.util.Scanner;
class B3{
    public static void main(String [] args){
        Scanner B = new Scanner(System.in);

        System.out.print("Enter value of score between 0-5: ");
        int score= B.nextInt();

        if (score==0 || score==1 ||score==2 ||score==3 ||score==4 ||score==5){
            if (score==5)
            System.out.println("A");

            else if (score==4)
            System.out.println("B");

            else if (score==3)
            System.out.println("C");

            else if (score==2)
            System.out.println("D");

            else if (score==1)
            System.out.println("E");

            else
            System.out.println("F");

        }
        else
        System.out.println("Enter correct score btn 0-5");
        
        
    }

}

        

        


