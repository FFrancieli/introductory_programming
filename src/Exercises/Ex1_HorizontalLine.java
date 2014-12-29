package Exercises;

/**
 * Created by Francieli on 29/12/2014.
 */
public class Ex1_HorizontalLine {

    public static void main(String[] args) {

        System.out.println(horizontalLine(8));
    }

    private static String horizontalLine( int numberOfSymbols){
        String symbol = "";
        for (int i = 0; i < numberOfSymbols; i++ ){
            symbol += "*";
        }

        return  symbol;
    }

}


