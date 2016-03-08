package kr.ac.smu.pratice02.goods;

public class Goods {
	
	int price;
	int number;
	String name;
	
	Goods(String name, int price, int number){
		
		this.name=name;
		this.price=price;
		this.number=number;
		
	}
	
	public void show(){
		System.out.println(name+"(가격:"+price+"원)이 "+number+"개 입고 되었습니다.");
	}
	
}