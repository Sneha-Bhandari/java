public class function{
    public static void main(String[] args){
        int value = 11;

        int twoTimes = twiceNumber(value); // value is called argument
        System.out.println(twoTimes);

        System.out.println(twiceNumber(5));
        System.out.println(twiceNumber(1050));


    }

    public static int twiceNumber (int num){ //'num is a parameter'
        int t= num*2;
        return t;
    }

    // method has:
    // return type (describe the type of output)
    // name(identifier)
    // parameters (list of values to be passed to method call)
    // body(implementation or details; how methods works)
    // return statement (optional; if void not required)
    // <return-tupe> <method-name>(<parameter-list){
        //method body
        // <optional return statement>
   // }
}