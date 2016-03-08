
public class CurrencyConverter {
	
	private static double rate=1121;
	public static double toDollar(double won) {
		return won/rate;// 한국 원화를 달러로 변환
	}
	public static double toKWR(double dollar) {
		return dollar*rate;// 달러를 한국 원화로 변환
	}
	public static void setRate(double r) {
		rate=r;// 환율 설정. KWR/$1
	}


	public static void main(String[] args) {
		System.out.println("백만원은 "+CurrencyConverter.toDollar(1000000)+"달러 입니다.");
		System.out.println("백달러는 "+CurrencyConverter.toKWR(100)+"원 입니다.");
	}	



}
