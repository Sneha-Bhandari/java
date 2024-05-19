//factorial

import java.util.Scanner;

public class  Factorial1{
      public static void main(String[] args){
        Scanner keyboard= new Scanner (System.in);
// prompt user to input a number
        int n=keyboard.nextInt();
        int f=1;
        for(int i=1; i<=n; i++){
            f=f*i;
        }
           System.out.printf("%d! = %d\n", n,f);
        }
      }
      