package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void should_say_the_number_when_count_off_given_number(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual = fizzBuzz.countOff(1);
        //then
        assertEquals("1",actual);
    }
    @Test
    void should_say_Fizz_when_count_off_given_multiple_of_3(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.countOff(3);
        assertEquals("Fizz",actual);
    }
    @Test
    void should_say_Buzz_when_count_off_given_multiple_of_5(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.countOff(5);
        assertEquals("Buzz",actual);
    }
    @Test
    void should_say_Whizz_when_count_off_given_multiple_of_7(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.countOff(7);
        assertEquals("Whizz",actual);
    }
    @Test
    void should_say_FizzBuzz_when_count_off_given_multiple_of_3_and_5(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.countOff(15);
        assertEquals("FizzBuzz",actual);
    }
    @Test
    void should_say_BuzzWhizz_when_count_off_given_multiple_of_5_and_7(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.countOff(35);
        assertEquals("BuzzWhizz",actual);
    }

}
