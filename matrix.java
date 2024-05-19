import java.util.Scanner;
public class matrix{
    public static void main(String[] args){
        int[] arr= new int[SIZE];
        float[] arr= new float[SIZE];

        // syntax: <datatype>[] <var-name> = new <datatype>[<size>];
        //in java
        int[] myArray =new int[10]; 
        // in c :
        // int myArray[10];

        for (int i= 0;i<myArray.length;i++){
            // take input from keyboard
        myArray[i] = input.nextInt();
        }
        for (int i= 9;i>=0;i--){
            // print the element at current index
          System.out.printf(i);
        }
       
    }
}