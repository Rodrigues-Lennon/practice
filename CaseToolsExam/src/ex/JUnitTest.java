package ex;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JUnitTest {
	
	static Caterpillar_241 test;
	int moves,cabbages;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		test=new Caterpillar_241(15,10);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test_GetMoves() {
		moves=test.get_moves();
		assertEquals(15,moves);
	}
	
	@Test
	void test_moves() {
		moves=test.move();
		assertEquals(16,moves);
		}
	
	@Test
	void test_eat() {
		cabbages=test.eat();
		assertEquals(10,cabbages);
	}

}
