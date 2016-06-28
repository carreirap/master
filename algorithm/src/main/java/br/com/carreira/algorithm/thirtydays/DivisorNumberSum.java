package br.com.carreira.algorithm.thirtydays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DivisorNumberSum {

	public static void main(String[] args) {
		DivisorNumberSum d = new DivisorNumberSum();
		d.divisorSum(200);

	}

	List<Integer> divisor = new ArrayList<Integer>();
	Set<Integer> multiplicator = new HashSet<Integer>();
	Set<Integer> allDivisor = new HashSet<Integer>();

	public int divisorSum(int n) {
		int maxDivisor = n;
		//multiplicator.add(n);
		multiplicator.add(1);

		int resto = 0;
		int result = n;
		int i = 2;
		while (true) {
			resto = n % i;
			if (resto == 0) {
				result = n / i;
				System.out.println(i);
				multiplicator.add(i);
				divisor.add(i);
				n = result;
			} else {
				++i;
			}
			if (result == 1) {
				break;
			}
		}
		System.out.println(multiplicator);
		System.out.println(divisor);
		for (Integer x : divisor) {
			this.recursive(maxDivisor,x, multiplicator, allDivisor);
			multiplicator.addAll(allDivisor);
		}
		System.out.println(allDivisor);
		return 0; 
	}
	
	public void recursive(int maxDivisor, Integer number, Set<Integer> mul, Set<Integer> divisor) {
		System.out.println(maxDivisor);
		for (Integer y : multiplicator) {
			if (number * y <= maxDivisor) 
				allDivisor.add(number * y);
		}
	}

}
