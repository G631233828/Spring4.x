package gjb.Aop.dao.impl;

import org.springframework.stereotype.Repository;

import gjb.Aop.dao.Calculator;

@Repository
public class CalculatorImpl implements Calculator {

	
	
	public CalculatorImpl() {
	}

	public void add(int x, int y) {
		System.out.println(x + y);
	}

	public void subtract(int x, int y) {
		System.out.println(x - y);
	}

	public void multiply(int x, int y) {
		System.out.println(x * y);
	}

	public void divide(int x, int y) {
		System.out.println(x / y);
	}

}
