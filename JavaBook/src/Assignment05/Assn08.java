package Assignment05;

//시간, 일자 출력을 위한 시스템시간정보
import java.time.LocalDateTime; 
import java.time.format.DateTimeFormatter;

public class Assn08 {
	public static void titlePrint() {
		System.out.println("\t  \"국민가게, 다이소\"");
		System.out.println("(주)아성다이소_분당서현점");
		System.out.println("전화: 031-702-6016");
		System.out.println("본사: 서울 강남구 남부순환로 2748 (도곡동)");
		System.out.println("대표: 박정부, 신호섭 213-81-52063");
		System.out.println("매장: 경기도 성남시 분당구 분당로53번길 11 (서현동)");
		System.out.println("========================================");
		System.out.println("\t소비자중심경영(CCM) 인증기업");
		System.out.println("\tISO 9001 품질경영시스템 인증기업");
		System.out.println("========================================");
		System.out.println("\t교환/환불 14일 (03월12일)이내,");
		System.out.println("(전자)영수증, 결제카드 지참 후 구입매장에서 가능");
		System.out.println("\t포장/가격 택 훼손시 교환/환불 불가");
		System.out.println("\t체크카드 취소 시 최대 7일 소요");
		System.out.println("========================================");
	}
	
	public static void timeStamp() {
		//시간, 일자 출력을 위한 시스템시간정보
		LocalDateTime now = LocalDateTime.now();
		String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss"));
		
		System.out.println("[POS 1058231]\t     " + formatedNow);
		System.out.println("========================================");
	}
	
	public static void headerPrint() {
		String item_name1 = "퓨어에어 비말차단용마스크(최고급형)";
		String item_code1 = "1031615";
		int item_price1 = 3000;
		int item_amount1 = 1;
		
		String item_name2 = "슬라이드식명찰(가로형)(100호)";
		String item_code2 = "11008152";
		int item_price2 = 1000;
		int item_amount2 = 1;
		
		String item_name3 = "매직흡착 인테리어후크(알루미늄타입)";
		String item_code3 = "1020800";
		int item_price3 = 1000;
		int item_amount3 = 1;
		
		System.out.println(item_name1 + " " + item_price1 + "  " + item_amount1 + "  " + (item_price1 * item_amount1));
		System.out.println("[" + item_code1 + "]");
		System.out.println(item_name2 + "    " + item_price2 + "  " + item_amount2 + "  " + (item_price2 * item_amount2));
		System.out.println("[" + item_code2 + "]");
		System.out.println(item_name3 + " " + item_price3 + "  " + item_amount3 + "  " + (item_price3 * item_amount3));
		System.out.println("[" + item_code3 + "]");
	}
	
	/*public static void itemPrint(int i) {
		
	}*/
	
	public static void totalPrint() {
		int price = 5000;
		double selling_price = price * (10.0 / 11);
		double tax = price - selling_price;
		
		System.out.println("\t\t과세합계\t\t    " + (int)selling_price);
		System.out.println("\t\t부가세\t\t    " + (int)tax);
		System.out.println("----------------------------------------");
		System.out.println("판매합계\t\t\t\t    " + price);
		System.out.println("========================================");
		System.out.println("신용카드\t\t\t\t    " + price);
		System.out.println("----------------------------------------");
		System.out.println("우리카드\t\t\t538720**********");
		System.out.println("승인번호 77982843(0)\t     승인금액 " + price);
		System.out.println("========================================");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int itemCount = 3; //항목이 몇 개인지
		titlePrint(); //영수증 맨 위 타이틀 인쇄
		timeStamp(); //출력시간 인쇄
		headerPrint(); //헤더(상품명, 단가, 수량, 금액) 인쇄
		
		/*for(int i = 0; i < itemCount; i++) { //항목 갯수만큼 항목 인쇄
			itemPrint(i);
		}*/
		
		totalPrint(); //합계 세액 등을 인쇄
	}

}
