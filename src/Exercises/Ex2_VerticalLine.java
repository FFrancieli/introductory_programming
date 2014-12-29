package Exercises;

/**
 * Created by Francieli on 29/12/2014.
 */
public class Ex2_VerticalLine {
    public static void main(String[] args) {
        printVerticalLine(8, "*");
    }

    private static void printVerticalLine(int numberOfSymbols, String symbol){
        for (int i = 0; i < numberOfSymbols; i++){
            System.out.println(symbol);
        }
    }
}
