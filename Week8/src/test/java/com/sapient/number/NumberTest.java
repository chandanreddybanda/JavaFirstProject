package com.sapient.number;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class NumberTest {
	private Number n;
	@BeforeEach
	void setUp() throws Exception {
		n=new Number();
	}

	@Test
	void testPrimeNumberReturnsOne() {
		int res=n.checkPrime(19);
		assertEquals(1, res);
	}
	@Test
	void testPrimeNumberReturnsZeroForEvenNumber() {
		int res=n.checkPrime(18);
		assertEquals(0, res);
	}
	@Test
	void testPrimeNumberReturnsZeroForOddNumber() {
		int res=n.checkPrime(15);
		assertEquals(0, res);
	}
	@Test
	void testPrimeNumberReturnsException() {
		assertThrows(IllegalArgumentException.class, ()->{
			n.checkPrime(-1);
		});
	}
	@Test
	void testPrimeNumberReturnsExceptionForZero() {
		assertThrows(IllegalArgumentException.class, ()->{
			n.checkPrime(0);
		});
	}
	@Test
	void testArmstrongNumberReturnsTrue() {
		boolean res=n.checkArmstrong(153);
		assertEquals(true, res);
	}
	@Test
	void testArmstrongNumberReturnsFalse() {
		boolean res=n.checkArmstrong(16);
		assertEquals(false, res);
	}
	@Test
	void testArmstrongNumberReturnsException() {
		assertThrows(IllegalArgumentException.class, ()->{
			n.checkArmstrong(-1);
		});
	}
	@Test
	void testArmstrongNumberReturnsExceptionForZero() {
		assertThrows(IllegalArgumentException.class, ()->{
			n.checkArmstrong(0);
		});
	}
	@Test
	void testPalindromeNumberReturnsTrue() {
		boolean res=n.checkPalindrome(1331);
		assertEquals(true, res);
	}
	@Test
	void testPalindromeNumberReturnsFalse() {
		boolean res=n.checkPalindrome(16);
		assertEquals(false, res);
	}
	@Test
	void testPalindromeNumberReturnsException() {
		assertThrows(IllegalArgumentException.class, ()->{
			n.checkPalindrome(-1);
		});
	}
	@Test
	void testPalindromeNumberReturnsExceptionForZero() {
		assertThrows(IllegalArgumentException.class, ()->{
			n.checkPalindrome(0);
		});
	}
}
