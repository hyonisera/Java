package Chap12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Example06 { //가장 많이 쓰는 파일 읽기 방식

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("example03.txt");
			if(!file.exists())
				file.createNewFile();
			FileReader fis = new FileReader(file);
			BufferedReader br = new BufferedReader(fis);
			String str;
			while((str = br.readLine()) != null) { //한줄씩 읽어들임
				System.out.println(str);
			}
			fis.close();
			System.out.println("파일 읽기 성공");
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}
