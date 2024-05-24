package assn07answer;
public class InputDataClient {
public static void main(String[] args) {
 int person = 30;
 int sumeng = 0, sumkor = 0, summat = 0, sumsum = 0, sumavg = 0;
 int avgeng, avgkor, avgmat, avgsum, avgavg;
 int cumeng = 0, cumkor = 0, cummat = 0, cumsum = 0, cumavg = 0;
 int cumavgeng, cumavgkor, cumavgmat, cumavgsum, cumavgavg;
 int allPerson = 200;
 int pagePerPerson = 30;
 int pagePerson;
 person = allPerson;
 InputData inData = new InputData(person);
 for(int i=0; i<person; i++){
   String name = "홍길" + i;
   int kor = (int)(Math.random() * 100);
   int eng = (int)(Math.random() * 100);
   int mat = (int)(Math.random() * 100);
   inData.setData(i, name, kor, eng, mat);
 }
 int page = (int)(allPerson/pagePerPerson);
 if((allPerson % pagePerPerson) != 0)
   page = page + 1;
 for(int j = 0; j < page; j++){
   sumkor = sumeng = summat = sumsum = sumavg = 0;
   if((allPerson - j * pagePerPerson) <  pagePerPerson)
     pagePerson = allPerson - j * pagePerPerson;
   else
     pagePerson = pagePerPerson;
   // 페이지 데이터
   for(int i=0; i<pagePerPerson; i++){
     sumkor += inData.kor[j*pagePerson + i];
     sumeng += inData.eng[j*pagePerson + i];
     summat += inData.mat[j*pagePerson + i];
     sumsum += inData.sum[j*pagePerson + i];
     sumavg += inData.avg[j*pagePerson + i];
   }
   avgkor = (int)(sumkor / pagePerson);
   avgeng = (int)(sumeng / pagePerson);
   avgmat = (int)(summat / pagePerson);
   avgsum = (int)(sumsum / pagePerson);
   avgavg = (int)(sumavg / pagePerson);
   // 누적 데이터
   cumkor += sumkor;
   cumeng += sumeng;
   cummat += summat;
   cumsum += sumsum;
   cumavg += sumavg;
   if(pagePerson == pagePerPerson){
     cumavgkor = (int)(cumkor / ((j + 1)* pagePerson));
     cumavgeng = (int)(cumeng / ((j + 1) * pagePerson));
     cumavgmat = (int)(cummat / ((j + 1) * pagePerson));
     cumavgsum = (int)(cumsum / ((j + 1) * pagePerson));
     cumavgavg = (int)(cumavg / ((j + 1) * pagePerson));
   }
   else{
     cumavgkor = (int)(cumkor / allPerson);
     cumavgeng = (int)(cumeng / allPerson);
     cumavgmat = (int)(cummat / allPerson);
     cumavgsum = (int)(cumsum / allPerson);
     cumavgavg = (int)(cumavg / allPerson);
   }
   System.out.println("\t\t\t성적집계표");
   System.out.println("PAGE: " + (j+1) + "\t\t\t\t\t\t\t출력일자: ");
   System.out.println("=================================================================");
   System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
   System.out.println("=================================================================");
   for(int i=0; i<pagePerson; i++){
     System.out.println((i+1) + "\t" + inData.name[j*pagePerson + i] + "\t" + inData.kor[j*pagePerson + i] + "\t" + inData.eng[j*pagePerson + i] + "\t" + inData.mat[j*pagePerson + i] + "\t" + inData.sum[j*pagePerson + i] + "\t" + (int)inData.avg[j*pagePerson + i]);
   }
   System.out.println("=================================================================");
   System.out.println("현재페이지");
   System.out.printf("합계\t\t%-4d\t%-4d\t%-4d\t%-4d\t%-4d\n", sumkor, sumeng, summat, sumsum, sumavg);
   System.out.printf("평균\t\t%-4d\t%-4d\t%-4d\t%-4d\t%-4d\n", avgkor, avgeng, avgmat, avgsum, avgavg);
   System.out.println("=================================================================");
   System.out.println("누적페이지");
   System.out.printf("합계\t\t%-4d\t%-4d\t%-4d\t%-4d\t%-4d\n", cumkor, cumeng, cummat, cumsum, cumavg);
   System.out.printf("평균\t\t%4d\t%4d\t%4d\t%4d\t%4d\n", cumavgkor, cumavgeng, cumavgmat, cumavgsum, cumavgavg);
   System.out.println("\n\n");
 }
}
}