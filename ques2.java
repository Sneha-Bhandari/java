// Fibonacci sequence 
// 1,2,3,5,8,13,21,34,55,89,.....

import java.util.Scanner;
 public class ques2 {
    public static void main (String[] args){
    Scanner input = new Scanner (System.in);
int a=1;
int b=2;
int c;
int sum=2;
while (true){
    c=a+b;
if(c>4000000 )
break;
if(c%2==0){
    sum = sum+c;
}  
//System.out.println(c);
a=b;
b=c;
}

System.out.println(sum);

    }
 }