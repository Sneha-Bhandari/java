import java.util.Scanner;
public class reverse{
    public static void main(String[] args){

        Scanner input= new Scanner(System.in);
        System.out.printf("enter array size: ");
        int size= input.nextInt();


        int[] numbers = new int[size];

        // get 10 numbers and store in array
        for (int i=0; i< numbers.length; i++){
            numbers[i] = input.nextInt();
        }
        // print the array in reverse order
        for(int i=numbers.length-1;i>=0;i-- ){
            System.out.println(numbers[i]);
        }

    }
}