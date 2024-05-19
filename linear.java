import java.util.Scanner;

public class linear{
    public static void main(String[] args){
        // write a method to evaluate y= mx+c
        Scanner input= new Scanner(System.in);
        System.out.print("Enter value of x:");
        int sizeX = input.nextInt();
        int[] x= new int[sizeX];
        int[] y= new int[sizeX];


        for(int i=0; i<sizeX;i++){
         x[i]= input.nextInt();
        }
        for(int i=0; i<sizeX; i++){
            y[i]= line(2, x[i], 5);
        System.out.printf("The output of %d is %d \n", x[i],y[i]);

        }

           
 // write a code to generate table
System.out.print("\nX |\t");
for(int i=0; i<sizeX; i++){
    System.out.printf("%d \t|\t",x[i]);

}
System.out.println(" ");
System.out.print("Y |\t");

for(int i=0; i<sizeX; i++){
    System.out.printf("%d \t| \t", y[i]);
}
        
    }





 public static int line(int m, int x, int c){ 
        return m* x + c;
    }
 
}