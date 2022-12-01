package tdd.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";

    public String countOff(int order) {
        if(order%3==0){
            return FIZZ;
        }
        return Integer.toString(order);
    }
}
