package SessionTwo;

public class Functions {

    public static void main(String[] args) {
        // DRY
       /* getSum(50,20);
        getSum(100,30);
        getSum(500,200);

       int sum = returnSum(10,20);
        System.out.println(sum);*/

        verifyLogin("Hi, Ahmed Ashraf");


        //Built-in
        Math.max(5,50);

    }

    // User Defined

    // function declaration(header)
    public static void getSum (int x ,int y ) //parameters
    {
        // void > return type
        //function implementation (body)
        System.out.println( "Total Sum: " + (x + y));
    }

    // function declaration(header)
    public static int returnSum (int x ,int y ) //parameters
    {
        // int > return type
        //function implementation (body)
        return x + y ;
    }


    public static String getWelcomeMsg()
    {
        return "Hi, Ahmed Ashraf";
    }

    public static void verifyLogin(String msg)
    {
        if ( getWelcomeMsg().equals(msg))
            System.out.println("Alf Mabroook!");
        else
            System.out.println("Is not allowed");

    }






}
