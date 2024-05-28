import java.util.Scanner;
public class calender{
public static void main(String[] args){
    Scanner input= new Scanner(System.in);
String day[]={"SUN", "MON", "TUE", "WED", "THU", "FRI", "Sat"};
System.out.println("Enter first day of month");
int first_day= input.nextInt();
System.out.println("Enter total number of days in a month:");
int total_days= input.nextInt();



for(int i=0;i<7;i++){
    
 String aligned= align(day[i]);
 System.out.print(aligned.toUpperCase());
}
System.out.println("");

int countspace=0;

if(first_day>=1 && first_day<=7){
    for(int i=1;i<first_day;i++){
        System.out.print(align(""));
    }
}

if(total_days>=1 && total_days<32){
    int dayCount=first_day;
    for(int i=1;i<total_days; i++){
        System.out.print(align(String.valueOf(i)));
    
if(dayCount%7==0){
    System.out.println("");
}
dayCount+=1;
    
}
}
}
public static String align(String s){

    String fill=" "; 
    String out= "";
        int colsize=7;
        int remaining=colsize-s.length();
        int leftspace=remaining/2;
      for(int i=0; i<leftspace;i++){
          out= out+fill;
      }
      out=out+s;
      int rightspace= remaining-leftspace;
      for(int i=0; i<rightspace;i++){
          out= out+fill;
      }
      return out;
        }
}
