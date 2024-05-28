import java.util.Scanner;
public class poem{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

   String[] poem={"Over hill, over dale",
"Thorough bush, thorough brier,",
"Over park, over pale",
"Thorough flood, thorough fire!,",
"I do wander everywhere",
"Swifter than the moon's sphere;",
"And I serve the Fairy Queen",
"To dew her orbs upon the green;",
"The cowslips tall her pensioners be;",
"In their gold coats spots you see;",
"Those be rubies, fairy favours;",
"In those freckles live their savours;",
"I must go seek some dewdrops here,",
"And hang a pearl in every cowslip's ear.",
"..."};

System.out.println("rightaligned poem");
rightalign(poem);

System.out.println("centeraligned poem");
centeralign(poem);

    }

    public static void rightalign(String[] poem){

        int column=poem[0].length();
        for(int i=0;i<poem.length;i++){
            if((poem[i].length())>column){
                column=poem[i].length();
            }
        }



for(int i=0;i<poem.length;i++){
    int space=column-poem[i].length();
    for(int j=0;j<space;j++){
System.out.print(" ");
    }
System.out.println(poem[i]);
}
    }

public static void centeralign(String[] poem){

        int column=poem[0].length();
        for(int i=0;i<poem.length;i++){
            if((poem[i].length())>column){
                column=poem[i].length();
            }
        }

        for(int i=0;i<poem.length;i++){
    int space=(column-poem[i].length())/2;
    for(int j=0;j<space;j++){
System.out.print(" ");
    }
System.out.println(poem[i]);
}

    }
    }

    