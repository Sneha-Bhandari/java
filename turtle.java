import java.util.Scanner;
public class turtle{
public static void main(String[] args){
    Scanner input= new Scanner(System.in);

    System.out.println("Enter 1st  move");
    System.out.println("Enter 2nd move");

    int move1= input.nextInt();
    int move2= input.nextInt();

    for(int i=0; i<move1; i++){
        System.out.println("*");
    }
     for(int i=0; i<move2; i++){
      
        System.out.print("* ");
        
    }
}
}
