package Chap04_2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Practice08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime now = LocalDateTime.now();
		String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
		
		System.out.print("주문 합계액을 입력하세요 : ");
		Scanner s = new Scanner(System.in);
		int price = s.nextInt();
		System.out.println();
		
		double selling_price = price * (10.0 / 11) + 1;
		double tax = selling_price * (1.0/10);
		
		System.out.println(" \t매출전표 (카드회사용)");
		System.out.println("맛꼬방치킨 \t\t  하순희");
		System.out.println("124-25-54620 \t063-632-6614");
		System.out.println("전북 남원시 농고길 11 (도통동)\n");
		System.out.println("하나기업카드 \t      신용승인(1)");
		System.out.println("거래일시:" + formatedNow);
		System.out.println("4336-9200-****-982* \t  일시불");
		System.out.println("IID:***13440  230964317368(0001)");
		System.out.println("가맹점No 00921293692");
		System.out.println("매입사 하나카드(다우데이타)");
		System.out.println("승인번호 40860059");
		System.out.println("--------------------------------");
		System.out.println("판매금액: \t\t\t" + (int)selling_price + "원");
		System.out.println("부가세: \t\t\t" + (int)tax + "원");
		System.out.println("합계: \t\t\t" + price + "원");
	}

}
