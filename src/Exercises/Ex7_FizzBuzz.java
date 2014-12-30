package Exercises;

/**
 * Created by Francieli on 30/12/2014.
 */
public class Ex7_FizzBuzz {

    public static void main(String args[]){
        FizzBuzz();
    }

    private static boolean isDivisibleByFive(int x){

        if (x % 5 ==0){
            return true;
        }
        return false;
    }

    private static boolean isDivisibleByThree(int x){
        if (x % 3 ==0){
            return true;
        }
        return false;
}

    private static void FizzBuzz(){
        for(int i = 1; i<=100; i++){
            if(isDivisibleByFive(i) && isDivisibleByThree(i)){
                System.out.println("FizzBuzz");
            }else if (isDivisibleByThree(i)){
                System.out.println("Fizz");
            }else if (isDivisibleByFive(i)){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }


}
