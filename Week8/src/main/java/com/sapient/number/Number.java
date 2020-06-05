package com.sapient.number;

public class Number {
	int checkPrime(int x) {
		if (x <= 0)
			throw new IllegalArgumentException("Invalid number.");
		if (x % 2 == 0)
			return 0;
		for (int i = 3; i <= Math.sqrt(x); i += 2) {
			if (x % i == 0) {
				return 0;
			}
		}
		return 1;
	}

	boolean checkArmstrong(int x) {
		if (x <= 0)
			throw new IllegalArgumentException("Invalid number.");
		int a = x, b = x, n = 0, sum = 0;
		while (a != 0) {
			n++;
			a = a / 10;
		}
		while (b != 0) {
			int c = b % 10;
			sum += Math.pow(c, n);
			b = b / 10;
		}
		if (sum != x)
			return false;
		return true;
	}

	boolean checkPalindrome(int x) {
		if (x <= 0)
			throw new IllegalArgumentException("Invalid number.");
		int a = x, rev = 0;
		while (a != 0) {
			rev = rev * 10 + a % 10;
			a = a / 10;
		}
		if (x != rev)
			return false;
		return true;

	}
}
