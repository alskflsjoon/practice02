package kr.ac.smu.practice02.calc;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("두 정수와 연산자를 입력하시오>>");
		//		a=scan.nextInt();
		//		c=scan.next().charAt(0);
		//		b=scan.nextInt();

		
		String inputs=scan.nextLine();
		String[] tokens = inputs.split(" ");
		//int lValue = Integer.parseInt(tokens[0]);
		//int rValue = Integer.parseInt(tokens[2]);

		if("quit".equals(inputs)){
			scan.close();
			return;
		}
		

		Arith arith = null;
		switch(tokens[1]){
		case "+":
			arith = new Add();
			break;
		case "-":
			arith = new Sub();
			break;
		case "*":
			arith = new Mul();
			break;
		case "/":
			arith = new Div();
			break;
		}

		if(arith!=null){
			int lValue = Integer.parseInt(tokens[0]);
			int rValue = Integer.parseInt(tokens[2]);

			arith.setValue(lValue, rValue);
			int result = arith.calculate();

			System.out.println(result);
		}

		scan.close();
	}

}
