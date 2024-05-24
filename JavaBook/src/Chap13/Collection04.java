package Chap13;

import java.util.HashSet;

public class Collection04 {

	public static void main(String[] args) {
		// TODO Auto-geneSTRINGmethod stub
		HashSet<String> str = new HashSet<String>(); //중복을 막음
		
		str.add("A");
		str.add("B");
		str.add("C");
		System.out.println(str);
		
		System.out.print("HashSet 요소: ");
		for(String elements : str) { //값을 하나씩 집어넣어서 뽑아냄
			System.out.print(elements + " ");
		}
		String[] array = new String[str.size()];
		str.toArray(array); //str 값을 array에 한번에 옮김=배열화 시킴(인덱스에 넣음)
		System.out.println();
		System.out.print("Array 요소: ");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
