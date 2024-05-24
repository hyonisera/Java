package Assignment02; //패키지명 Assignment02로 선언

public class SpecialCharEx { //클래스명 SpecialCharEx로 선언

	public static void main(String[] args) { //메인 메서드가 문자열 배열을 받을 수 있음
		// TODO Auto-generated method stub
		System.out.println('\''); //이스케이프 문자 \'를 사용하여 작은따옴표 '가 출력됨
		//이스케이프 문자 \t를 사용하여 abc와 123 사이에 탭을 해주고, 이스케이프 문자 \b를 사용하여 123 다음에 백스페이스를 사용했기 때문에 커서를 왼쪽으로 한칸 이동시키고 456을 출력하므로 3은 지워짐
		System.out.println("abc\t123\b456");
		System.out.println('\n'); //이스케이프 문자 \n를 사용하여 줄을 바꿈
		System.out.println("\"Hello\""); //이스케이프 문자 \"를 사용하여 큰따옴표 "를 출력하기 때문에 "Hello"가 출력됨
		System.out.println("c:\\"); //이스케이프 문자 \\를 사용하여 역슬래쉬 \를 출력하기 때문에 c:\가 출력됨
	}

}
