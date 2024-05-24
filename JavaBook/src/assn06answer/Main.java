package assn06answer;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import org.junit.jupiter.api.Test;
import java.util.Scanner;
public class Main {
public static int[] lottonumber(){
 int[] lotto = new int[7];
 for(int i=0; i<7; i++){
   int temp = (int)(Math.random() * 45 + 1);
   int count = 0;
   if(i != 0){
     for(int j=0; j<i; j++){
       if(temp == lotto[j])
         count = count + 1;
     }
     if(count != 0) continue;
   }
   lotto[i] = temp;
 }
 return lotto;
}
public static int comparenumber(int[] lo1, int[] lo2){
 int match = 0;
 for(int j=0; j<6; j++){
   for(int i=0; i<6; i++){
     if(lo1[j] == lo2[i]) match = match + 1;
   }
 }
 return match;
}
public static void main(String[] args) {
 int[] lotto = new int[7];
 int[] user = new int[6];
 int bonus;
 Scanner sc = new Scanner(System.in);
 lotto = lottonumber();
 bonus = lotto[6];
 
 //user = lottonumber(); //자동으로 할 때
 
 for(int i=0; i<7; i++){
   System.out.println(lotto[i]);
 }
 int temp;
 do{
   temp = 0;
   System.out.println("로또 번호를 입력하세요");
   for(int i=0; i<6; i++){
     user[i] =  sc.nextInt();
   }
   for(int i=0; i<5; i++){
     temp = user[i];
     for(int j=i+1; j<6; j++){
       if(temp == user[j]) {
         System.out.println("중복 값은 입력할 수 없습니다. 다시 입력해주세요");
         temp = 999; //999=의미없는 값
         break;
       }
     }
     if(temp == 999) break;
   }
 }while(temp == 999);
 int match = comparenumber(lotto, user);
 System.out.print("로또 당첨번호 : ");
 for(int i=0; i<6; i++)
   System.out.print(lotto[i] + " ");
 System.out.println("");
 if(match == 6){
   System.out.println("추첨 결과: 1등입니다");
 }
 else if(match == 5){
   for(int i=0; i<6; i++){
     if(bonus == user[i]) {
       System.out.println("추첨 결과: 2등입니다");
       bonus = 999;
       break;
     }
   }
   if(bonus != 999)
     System.out.println("추첨 결과: 3등입니다");
 }
 else if(match == 4){
   System.out.println("추첨 결과: 4등입니다");
 }
 else if(match == 3){
   System.out.println("추첨 결과: 5등입니다");
 }
 else{
   System.out.println("추첨 결과: 꽝 입니다");
 }
}
// @Test
// void addition() {
//     assertEquals(2, 1 + 1);
// }
}