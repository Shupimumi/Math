package learning.jUnit.tests;

import methods.Sqrt;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AllTests {

    @Test
    void checkResultTest(){
        double number = 5;
        number*=number;
        Sqrt sqrt = new Sqrt(5);
        assertEquals(sqrt.sqrt(), number);
    }
}
