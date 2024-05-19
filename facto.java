public class facto{
    public static void main(String[] args){
        
       int f= factorial(5);
       System.out.println(f);


    }

    public static int factorial (int n){ //'n is a parameter'
    int f=1;
    for(int i=1; i<=n; i++){
        f=f*i;
    }
    
    return f;
    }
}
