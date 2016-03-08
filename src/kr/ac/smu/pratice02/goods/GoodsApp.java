package kr.ac.smu.pratice02.goods;

import java.util.Scanner;

public class GoodsApp {
	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		String name1,name2,name3;
		int price1,price2,price3;
		int number1,number2,number3;
		
		name1=scanner.next();
		price1=scanner.nextInt();
		number1=scanner.nextInt();
		name2=scanner.next();
		price2=scanner.nextInt();
		number2=scanner.nextInt();
		name3=scanner.next();
		price3=scanner.nextInt();
		number3=scanner.nextInt();
		
		scanner.close();
		
		Goods first=new Goods(name1,price1,number1);
		Goods second=new Goods(name2,price2,number2);
		Goods third=new Goods(name3,price3,number3);
		
		first.show();
		second.show();
		third.show();
		
	}
}

