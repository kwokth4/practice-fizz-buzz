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
    void shoud_say_Fizz_when_count_off_given_mutiple_of_3(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.countOff(3);
        assertEquals("Fizz",actual);
    }

}
