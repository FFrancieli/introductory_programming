package Exercises;

/**
 * Created by Francieli on 29/12/2014.
 */
public class ex3_rightTriangle {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 1; i <= n; i++){
            System.out.println(horizontalLine(i, "*"));
        }
    }

    private static String horizontalLine( int numberOfSymbols, String symbol){
        String str = "";
        for (int i = 0; i < numberOfSymbols; i++ ){
            str += symbol;
        }

        return  str;
    }
}
