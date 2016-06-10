package br.com.carreira.algorithm.thirtydays;

public class FactorialRecursive {

	
	public static void main(String[] args) {
		int n = 6;
		System.out.println(calculateFactorial(n,n-1));
	}
	
	
	public static int calculateFactorial(int n, int factor) {
		if (factor > 0) {
			return calculateFactorial(n * factor, factor - 1);
			
		} else {
			return n;
		}
	}
}
