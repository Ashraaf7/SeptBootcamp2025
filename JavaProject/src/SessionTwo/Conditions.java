package SessionTwo;

public class Conditions {
    public static void main(String[] args) {
        /*
        if(condition)
        {
            //block scope
        }
         */
        /*
        int age = 19;
        if (age <= 18) //false
        {
            System.out.println("You are not allowed to use our application");
        }*/ //CTRL+SHIFT+/

    /*    String password = "admin"; // Web page
        if (password.equalsIgnoreCase("Admin"))
        {
            System.out.println("You are logged in successfully!");
        }
        else
        {
            System.out.println("Password is incorrect!");
        }*/


        // Recommendation System
        boolean CamIntersted = false;
        boolean isAGamer = false;

        int budget = 20000;

        if (CamIntersted && !isAGamer) { //and or
            System.out.println("Samsung 25 Ultra");
        }
        else if (isAGamer && !CamIntersted) {
            System.out.println("OnePlus");
        }
        else if (CamIntersted && isAGamer) {
            System.out.println("Iphone 17 pro max");
        }
        else if (isAGamer || budget<50000) {
            System.out.println("Samsung 24 FE");
        }
        else {
            System.out.println("Nokia N73");
        }

    }
}
