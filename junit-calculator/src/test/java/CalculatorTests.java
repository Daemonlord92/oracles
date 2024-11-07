import org.blitmatthew.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTests {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

    @Test
    void Calculator_add_shouldSucceed() {

        int result = calculator.add(4, 9);

        assertEquals(13, result, "the add when adding 9 + 4 should equal 13");
    }

    @Test
    void Calculator_divide_ShouldThrowExceptionWhenSecondParamIsZero() {

        Throwable throwable = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(5,0);
        });

        assertEquals(ArithmeticException.class, throwable.getClass());
        assertEquals("Cannot divide by zero", throwable.getMessage());
    }
    
    @ParameterizedTest
    @ValueSource(ints = {5, 6, 8, 9, 10})
    void Calculator_add_ShouldSucceedWhenFedMulipleValues(int arg){

        int result = calculator.add(5, arg);
        
        assertEquals((5+arg), result);
    }
}
