package Exercises;


public class ex4_IsoscelesTriangle {

    public static void main(String[] args) {
        int n = 3;

        drawTriangle(n);
    }


    private static String insertWhiteSpace(int numberOfWhiteSpaces) {
        String str = "";
        for (int i = 0; i < numberOfWhiteSpaces; i++) {
            str = " " + str;
        }
        return str;
    }

    private static void drawTriangle(int n){

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

}