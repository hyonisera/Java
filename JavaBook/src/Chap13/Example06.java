package Chap13;

import java.util.HashMap;
import java.util.Iterator;

public class Example06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> cats = new HashMap<Integer, String>();
		cats.put(1, "페르시안"); //앞은 key 값, 뒤는 value 값
		cats.put(2, "샴");
		System.out.println(cats);
		cats.put(3, "러시안블루");
		System.out.println(cats);
		cats.put(3, "래그돌"); //replace 안 쓰고 덮어쓰기
		System.out.println(cats);
		cats.remove(1);
		System.out.println(cats);
		System.out.println(cats.size());
		System.out.println(cats.get(2));
		System.out.print("(Key, Value) = ");
		Iterator<Integer> keys = cats.keySet().iterator(); //Iterator와 hasNext() 같이 씀
		while(keys.hasNext()) { //다음에 값이 있으면 가져옴
			int key = keys.next();
			System.out.print(" (" + key + ", " + cats.get(key) + ") ");
		}
	}

}
