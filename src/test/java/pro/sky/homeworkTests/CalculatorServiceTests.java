package pro.sky.homeworkTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import pro.sky.homeworkTests.exceptions.MyIllegalArgumentException;
import pro.sky.homeworkTests.services.CalculatorService;

@SpringBootTest
class CalculatorServiceTests {
	CalculatorService out = new CalculatorService();

	@Test
	void summingTwoNums() {
		int result = out.plus(3, 3);
		Assertions.assertEquals(6, result);
	}

	@Test
	void minusTwoPositiveNums() {
		int result = out.plus(3, 3);
		Assertions.assertEquals(6, result);
	}

	@Test
	void summingTwoNegativeNums() {
		int result = out.plus(-5, -3);
		Assertions.assertEquals(-8, result);
	}

	@Test
	void substractingTwoPositiveNums() {
		int result = out.minus(3, 3);
		Assertions.assertEquals(0, result);
	}

	@Test
	void substractingTwoNegativeNums() {
		int result = out.minus(-5, -3);
		Assertions.assertEquals(2, result);
	}

	@Test
	void multiplyingTwoPositiveNumbers() {
		int result = out.mul(5, 5);
		Assertions.assertEquals(25, result);
	}

	@Test
	void multiplyingTwoNegativeNumbers() {
		int result = out.mul(-5, -5);
		Assertions.assertEquals(25, result);
	}

	@Test
	void multiplyingPositiveAndNegativeNumbers() {
		int result = out.mul(-5, 5);
		Assertions.assertEquals(-25, result);
	}

	@Test
	void dividingTwoPositiveNumbers() {
		int result = out.div(5, 5);
		Assertions.assertEquals(1, result);
	}

	@Test
	void dividingPositiveAndNegativeNumbers() {
		int result = out.div(-5, 5);
		Assertions.assertEquals(-1, result);
	}

	@Test
	void zeroDivisionException() {
		Assertions.assertThrows(MyIllegalArgumentException.class, () -> out.div(5, 0));
	}
}