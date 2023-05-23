import com.drot.calculator.CalculatorService;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceParametricTests {

    CalculatorService out = new CalculatorService();

    private static Stream<Arguments> parameters(){
        return Stream.of(
            Arguments.of(4,7),
            Arguments.of(-10,7),
            Arguments.of(2,-5),
            Arguments.of(-8,-3));
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void plusTest(int num1, int num2){
        int actual = out.plus(num1, num2);
        int expected = num1 + num2;
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void minusTest(int num1, int num2){
        int actual = out.minus(num1, num2);
        int expected = num1 - num2;
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void multiplyTest(int num1, int num2){
        int actual = out.multiply(num1, num2);
        int expected = num1 * num2;
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void divideTest(int num1, int num2){
        float actual = out.divide(num1, num2);
        float expected = (float) num1 / num2;
        assertEquals(expected, actual);
    }


}
