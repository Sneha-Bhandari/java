import java.util.Scanner;
public class max{
    public static void main(String[] args){
      Scanner input= new Scanner(System.in);
        // get 10 numbers from user
        // print the following
        //max value
        //min value
        //avg value
        // sum of all values
        int n= input.nextInt();
        int sum=n;
        int min=n;
        int max=n;

        for(int i=1; i<=9;i++){
        n = input.nextInt();
        sum= sum+n;
        if(n>max)
        {
            max=n;
        }
        else if (n<min){
            min=n;
        }
                }
        float avg= sum/10;
        System.out.println("Sum: " + sum);
        System.out.println("Avg: " + avg);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

       int m = input.nextInt();
        System.out.printf("you hace enetered %d and %d\n",n ,m);


        }
    }
