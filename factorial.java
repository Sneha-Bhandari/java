// multiple 
import java.util.Scanner;

public class  factorial{
      public static void main(String[] args){
        Scanner keyboard= new Scanner (System.in);

        int n=keyboard.nextInt();
        for(int i=1; i<=10; i++){
           System.out.printf("%d X %d = %d \n",n,i,n*i);
        }
      }
      }