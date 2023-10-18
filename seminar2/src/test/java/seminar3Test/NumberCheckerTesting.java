package seminar3Test;

import Seminar3.NumberChecker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberCheckerTesting {    
    private NumberChecker mychecker;

    @BeforeEach
    void setUp() {
        mychecker = new NumberChecker();
    }

    //проверяет, является ли четным/нечетным
    @Test
    void evenNumberedOrNot() {
        assertTrue(mychecker.evenOddNumber(18));
        assertFalse(mychecker.evenOddNumber(17));
	}

    //проверяет, находится ли число в интервале
    @Test
    void numberInInterval() {
        int num = 50;
        assertTrue(mychecker.numberInInterval(50));
        assertFalse(mychecker.numberInInterval(0));
    }

}
