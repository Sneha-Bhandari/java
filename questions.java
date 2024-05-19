//problem 1 (projecteuler.net)

// sum of all  multiple of 3 and 5 below 1000
// multiples of 3: 3,6,9,.....,999
//multiples of 5: 5,10,15,....995
// combination: 3,5,6,9,10......

import java.util.Scanner;
public class questions{
    public static void main(String[] args){
    Scanner input = new Scanner (System.in);
    int sum=0;
    for(int i =1; i<1000; i++){
    if(i % 3==0){
    sum= sum+i;
    }
    else if (i%5==0 ){
    sum= sum+i;
    }
}
    System.out.printf("sum is %d\n", sum);

    }
    }