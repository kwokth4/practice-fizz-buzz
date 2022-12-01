package tdd.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "Whizz";

    public String countOff(int order) {
        if(order%3!=0 || order%5!=0 || order%7!=0) {
            String result="";
            if (order % 3 == 0) {
                result += FIZZ;
            }
            if (order % 5 == 0) {
                result += BUZZ;
            }
            if (order % 7 == 0) {
                result += WHIZZ;
            }
            return result;
        }
        return Integer.toString(order);
    }
}
