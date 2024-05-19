public class nepathya{
    public static void main(String[] args){

        String word= "NEPATHYA";
        
        for(int i=0; i< word.length(); i++){
            for(int j=0;j< word.length();j++){
                if(j<=i){
                    System.out.print(word.charAt(j));
                }else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }
}