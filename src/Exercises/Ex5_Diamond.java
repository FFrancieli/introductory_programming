package Exercises;

/**
 * Created by Francieli on 29/12/2014.
 */
public class Ex5_Diamond {
    public static void main(String[] args) {
        int n = 4;
        drawTriangleTop(n);
        drawTriangleDown(n - 1);

    }


    private static void drawTriangleTop(int n){

        int numberOfSpaces = n - 1;
        int numberOfSymbols = 1;
        String str = "";

        for (int i = 1; i <= n; i++){

            str += insertWhiteSpace(numberOfSpaces);

            for (int j = 0; j < numberOfSymbols; j++){
                str += "*";
            }

            numberOfSymbols += 2;
            numberOfSpaces --;

            System.out.println(str);
            str = "";
        }
    }

    private static void drawTriangleDown(int n){
        int numberOfSpaces = 1;
        int numberOfSymbols = (n - 1) * 2  + 1;
        String str = "";

        for (int i = 1; i <= n; i++){

            str += insertWhiteSpace(numberOfSpaces);

            for (int j = 0; j < numberOfSymbols; j++){
                str += "*";
            }

            numberOfSymbols -= 2;
            numberOfSpaces ++;

            System.out.println(str);
            str = "";
        }
    }

    private static String insertWhiteSpace(int numberOfWhiteSpaces) {
        String str = "";
        for (int i = 0; i < numberOfWhiteSpaces; i++) {
            str = " " + str;
        }
        return str;
    }

}
