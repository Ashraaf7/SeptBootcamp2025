package SessionTwo;

public class Loops {
    public static void main(String[] args) {
        // start       condition         increment/decrement(routine)
        //  1         <11 or <=10               +1

    /*   for ( int i = 500 ;   i >= 200       ;   i--    )  // 1  2  3  4  5  6  7 8 9 10
       {
           //block
           System.out.println(i); //500 499 498 497 ...    200
       }*/

       String [] listOfProducts = {"Bag" , "Book" , "Pen" , "Pencil"};
       // i > incrmental
       //for (int i =0 ; i <4 ;i++)
       for (String item : listOfProducts)
       {
           System.out.println(item);
       }


       //rest of code
    }
}
