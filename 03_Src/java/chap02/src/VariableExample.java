
public class VariableExample {
	/*
	 * 식별자 (Identifier)
	 * 		- 글자 갯수 제한 없음
	 * 		- 문자(영어+한글)
	 * 		- 숫자 (0~9)
	 * 		- 특수문자 _,$ 가능
	 * 
	 * 		- 첫문자는 반드시 ( 문자, _, $ ) 만 가능 / 숫자가 오면 안됨
	 * 		
	 * 				 1  	2		3 ... 
	 *				 문자		문자		문자
	 * 				_, $	_,$,	_,$
	 * 						숫자		숫자
	 * 
	 * 복합단어명을 식별자로 사용할 때 : 낙타표현법 사용 (= Camel case 카멜케이스 / 카멜 표기법)
	 * camel (낙타)
	 * 
	 * People + Num 
	 * = NumOfPeople (클래스는 반드시 대문자로 시작)
	 * = numOfPeople (변수를 지을땐 소문자로)
	 * 					//문법적 오류는 없지만 무언의 약속으로 지어진 형태..
	 * 
	 * 	클래스 이름은 대문자로 시작 :)
	 * 	변수는 소문자로 지어진다. 
	 * 	
	 * 
	 */
	
	public static void main(String[] args) {
		
		int 대한민국 = 10;
		int num1 = 100;
		int num2 = 200;
		int num___ = 300;
		int num$$$ = 400;
//		int num% = 500; / error
		
		
//		int 9num = 100; // error
		int _num = 100; 
		int $num = 200;
		
	}

}
