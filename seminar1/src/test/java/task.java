

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

import org.example.Calculator;
import org.junit.jupiter.api.*;

class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @BeforeAll
    public static void initAll() {
        System.out.printf("Hiii!!!!!");
    }

    @AfterAll
    public static void tearDownAll() {
        System.out.printf("END!");    }

    @AfterEach
    public void tearDown() {
        calculator = null; // Очистка после каждого теста
    }

    @Test
    @DisplayName("Проверка равенства значений")
    void testAssertEquals() {
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    @DisplayName("Проверка неравенства значений")
    void testAssertNotEquals() {
        assertNotEquals(5, calculator.add(2, 2));
    }

    @Test
    @DisplayName("Проверка истинного условия")
    void testAssertTrue() {
        assertTrue(calculator.add(2, 2) == 4);
    }

    @Test
    @DisplayName("Проверка ложного условия")
    void testAssertFalse() {
        assertFalse(calculator.add(2, 2) == 5);
    }

    @Test
    @DisplayName("Проверка наличия объекта")
    void testAssertNotNull() {
        assertNotNull(calculator);
    }

    @Test
    @DisplayName("Проверка отсутствия объекта")
    void testAssertNull() {
        calculator = null;
        assertNull(calculator);
    }

    @Test
    @DisplayName("Проверка равенства массивов")
    void testAssertArrayEquals() {
        int[] expected = {1, 2, 3};
        int[] actual = {1, 2, 3};
        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Проверка на генерацию исключений")
    void testAssertThrows() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
    }

    // Дополнительные ассерты
    @Test
    @DisplayName("Проверка с сообщением")
    void testAssertWithMessage() {
        assertEquals(4, calculator.add(2, 2), "2 + 2 должно быть равно 4");
    }

    @Test
    @DisplayName("Проверка с использованием лямбда-выражения для сообщения")
    void testAssertWithLambdaMessage() {
        assertEquals(4, calculator.add(2, 2), () -> "2 + 2 должно быть равно 4");
    }

    @Test
    @DisplayName("Проверка результатов calculateDiscount")
    void testingResults() {

        double result = calculator.calculateDiscount(100, 25);
        assertThat(result).isEqualTo(75);


        result = calculator.calculateDiscount(0, 50);
        assertThat(result).isEqualTo(0);


        result = calculator.calculateDiscount(100, 0);
        assertThat(result).isEqualTo(100);
    }

    @Test
    @DisplayName("Проверка значении calculateDiscount")
    void testingDiscount() {
        // Проверяем, что метод выбрасывает исключение при передаче отрицательной суммы покупки.
        assertThatThrownBy(() -> calculator.calculateDiscount(-300, 15))
                .isInstanceOf(ArithmeticException.class).hasMessage("Сумма покупки не должна быть отрицательной");

        // Проверяем, что метод выбрасывает исключение при передаче отрицательного процента скидки.
        assertThatThrownBy(() -> calculator.calculateDiscount(300, -10))
                .isInstanceOf(ArithmeticException.class).hasMessage("Сумма скидки не должна быть отрицательной");
    }




}