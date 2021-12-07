import java.util.Scanner;
import java.util.Arrays;
class B7{
    public static void main(String [] args){
        int n=5;  
        int sum=0;
        Scanner ts=new Scanner(System.in);  
        int[] array = new int[n];  
        System.out.println("Enter the sales of the week: ");  
        for(int i=0; i<n; i++)  
        {  
        array[i]=ts.nextInt();  
        }   
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        for (i=0; i<=array.length; i++){
        System.out.println(max.array[i]);
        }
       
    }  
}