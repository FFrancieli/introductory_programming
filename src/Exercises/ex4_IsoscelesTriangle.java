package Exercises;

/**
 * Created by Francieli on 29/12/2014.
 */
public class ex4_IsoscelesTriangle {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i < 2*n; i +=2){
            System.out.println(drawTriangleLine(2*n,i));
        }

    }

    private static int getNumberOfWhiteSpaces(int numberOfSymbols){
        return numberOfSymbols/2;
    }

    private static String insertWhiteSpace(int numberOfWhiteSpaces) {
        String str = "";
        for (int i = 0; i < numberOfWhiteSpaces; i++) {
            str = " " + str;
        }

        return str;
    }

    private static String drawTriangleLine(int numberOfSymbols, int numberOfSymbolsInLine) {
        int numberOfWhiteSpaces = 0;
        numberOfWhiteSpaces = getNumberOfWhiteSpaces( numberOfSymbols - numberOfSymbolsInLine);
        String str = insertWhiteSpace(numberOfWhiteSpaces);

        for (int i = 0; i < numberOfSymbolsInLine; i++ ){
            str += "*";
        }

        return str;
    }

}