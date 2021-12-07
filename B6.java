class B6{
    public static void main ( String [] args){
        int sum=0;
        for (int num=0; num<=100; num++){
            if (num % 2 == 0){
                System.out.println(num +" Is even number");
                sum+=num;
            }
            

        }
        System.out.println(sum);
        




    }
}