
public class ArrayParameter {

	static void printCharArray(char[] input){
		System.out.println(input);
	}

	static void replaceSpace(char[] input){
		int length=input.length;
		for(int i=0;i<length;i++){
			if(input[i]==' '){
				input[i]=',';
			}
		}
	}

	public static void main(String[] args) {
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
		printCharArray(c);  // 원래 배열 원소 출력
		replaceSpace(c);    // 공백 문자 바꾸기
		printCharArray(c);  // 수정된 배열 원소 출력
	}
}
