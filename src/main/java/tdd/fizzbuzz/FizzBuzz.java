package tdd.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "Whizz";

    public String countOff(int order) {
        if(order%3==0){
            return FIZZ;
        }
        if(order%5==0){
            return BUZZ;
        }
        if(order%7==0){
            return WHIZZ;
        }
        return Integer.toString(order);
    }
}
