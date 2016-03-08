package kr.ac.smu.practice02.calc;

public abstract class Arith {
	protected int a;
	protected int b;
	
	void setValue(int a, int b){
		this.a=a;
		this.b=b;
	}
	
	abstract int calculate();
}
