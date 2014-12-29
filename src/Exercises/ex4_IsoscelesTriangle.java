package Exercises;

/**
 * Created by Francieli on 29/12/2014.
 */
public class ex4_IsoscelesTriangle {

    public static void main(String[] args) {

    }

    private static int getNumberOfWhiteSpaces(int numberOfSymbols){
        return numberOfSymbols/2;
    }

    private static String insertWhiteSpace(int numberOfWhiteSpaces, String strSymbols) {
        String str = "";
        for (int i = 0; i < numberOfWhiteSpaces; i++) {
            str = " " + strSymbols;
        }
    return str;
}

    private static void drawTriangle(int numberOfSymbols){
        int numberOfWhiteSpaces = 0;
        String lineTriangle = "";

        for (int i = 1; i <= numberOfSymbols; i++){
            numberOfWhiteSpaces = getNumberOfWhiteSpaces( numberOfSymbols - i);
            lineTriangle = insertWhiteSpace(numberOfWhiteSpaces);
            lineTriangle +=
        }
    }
}
