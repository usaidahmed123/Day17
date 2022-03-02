package day17;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

//@Test
public class JUnitDemo {
@Test
	void display() {
		System.out.println("Junit testing for method 1");
	}
@Test
	void display2() {
		System.out.println("Testing for method 2");
	}
@Disabled
@Test
void display3() {
	System.out.println("Testing for method 3");
}

}

