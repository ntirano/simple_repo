package list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		System.out.println("subList() :  arrayList에서 일부를 뽑아 새로운 배열 생성");
		ArrayList list2 = new ArrayList(list1.subList(1,4)); //0 (1) 2 3 4 (5)   
		
		print(list1,list2);
		System.out.println("Collection : 인터페이스 / Collections : 유틸 클래스 ");
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1,list2);

		System.out.println("오름차순 정렬 후 뒤지업주기 > 내림차순");
		Collections.reverse(list1 );
		print(list1,list2);
		
		System.out.println("갖고있느냐");
		System.out.println("list1.containsAll(list2) : "+list1.containsAll(list2));
		System.out.println("list2.containsAll(list1) : "+list2.containsAll(list1));
		
		System.out.println("배열에추가");
		list2.add("B");

		list2.add("C");
		
		list2.add(3, "A"); //0 1 2 "3"번째 자리에 A추가 
		print(list1,list2);		
		
		System.out.println("set() 해당(인덱스) 위치에 내용을 변경");
		list2.set(3, "AA");
		print(list1, list2);
		
		System.out.println("indexOf() : 지정된 객체의 위치(인덱스) 를 알려줌");
		
		list1.add(0,"1"); 
		System.out.println("index = "+list1.indexOf("1"));
		System.out.println("index = "+list1.indexOf(1));
		
		print(list1,list2);
		
		System.out.println("remove() : 해당 인덱스 값 삭제");
		list1.remove(1);//1의 자리인 5가 사라짐
		list1.remove(new Integer(1)); // 배열 안에 실제값 1 일 사라짐
		print(list1,list2);

		System.out.println( "retainAll() 곂치는부분만 남기고 나머지 삭제  ");
		System.err.println("list1.retainAll(list2) : "+ list1.retainAll(list2));
		print(list1,list2);
		
		System.out.println("(\"곂치는부분삭제\"); //데이터를 삭제할땐 뒤에서부터 삭제해야한다!");
		System.out.println("곂치는부분삭제");
		
//		for(int i=0; i <list2.size(); i++) {
//			list2.remove(i);
//		}
//		print(list1,list2);
		
		//		System.out.println("list1.removeAll(list2) : "+list1.removeAll(list2));
//		System.out.println("list2.removeAll(list1) : "+list2.removeAll(list1));
//		print(list1,list2);
//		
//		for(int i = list2.size()-1; i>=0; i--) {
//			list2.remove(i);
//		}
		
		for(int i = list2.size()-1; i>=0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		
		print(list1,list2);
	}
	
	
	static void print (ArrayList list1,ArrayList list2) {
		System.out.println("list1 : "+ list1);
		System.out.println("list2 : "+ list2);
		
		System.out.println();
	}
}
