package Exercises;

import java.util.ArrayList;

/**
 * Created by Francieli on 30/12/2014.
 */
public class Ex8_PrimeFactors {

    public static void main(String args[]){
        System.out.println(generate(30));
}

    private static boolean isPrime(int number){
        boolean resp = false;
        if (number <= 1){
            return false;
        }else if (number == 2){
           return true;
        }else {
            if (number % 2 ==0){
                return false;
            }else {
                for (int i = 2; i <number; i++){
                    if (number%i==0){
                        return false;
                    }
                }
            }
        }

        return true;
    }

    private static boolean isDivisible(int number, int divisibleBy){
        if(divisibleBy % number == 0){
            return true;
        }
        return false;
    }

    private static ArrayList<Integer> generate(int number){
        ArrayList<Integer> primeList = new ArrayList<Integer>();

        for (int i = 2; i <= number; i++){
            if (isPrime(i) && isDivisible(i, number)){
                primeList.add(i);
            }
        }
        return primeList;
    }

}
