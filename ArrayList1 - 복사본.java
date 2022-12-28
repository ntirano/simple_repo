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
		System.out.println("subList() :  arrayList���� �Ϻθ� �̾� ���ο� �迭 ����");
		ArrayList list2 = new ArrayList(list1.subList(1,4)); //0 (1) 2 3 4 (5)   
		
		print(list1,list2);
		System.out.println("Collection : �������̽� / Collections : ��ƿ Ŭ���� ");
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1,list2);

		System.out.println("�������� ���� �� �������ֱ� > ��������");
		Collections.reverse(list1 );
		print(list1,list2);
		
		System.out.println("�����ִ���");
		System.out.println("list1.containsAll(list2) : "+list1.containsAll(list2));
		System.out.println("list2.containsAll(list1) : "+list2.containsAll(list1));
		
		System.out.println("�迭���߰�");
		list2.add("B");

		list2.add("C");
		
		list2.add(3, "A"); //0 1 2 "3"��° �ڸ��� A�߰� 
		print(list1,list2);		
		
		System.out.println("set() �ش�(�ε���) ��ġ�� ������ ����");
		list2.set(3, "AA");
		print(list1, list2);
		
		System.out.println("indexOf() : ������ ��ü�� ��ġ(�ε���) �� �˷���");
		
		list1.add(0,"1"); 
		System.out.println("index = "+list1.indexOf("1"));
		System.out.println("index = "+list1.indexOf(1));
		
		print(list1,list2);
		
		System.out.println("remove() : �ش� �ε��� �� ����");
		list1.remove(1);//1�� �ڸ��� 5�� �����
		list1.remove(new Integer(1)); // �迭 �ȿ� ������ 1 �� �����
		print(list1,list2);

		System.out.println( "retainAll() ��ġ�ºκи� ����� ������ ����  ");
		System.err.println("list1.retainAll(list2) : "+ list1.retainAll(list2));
		print(list1,list2);
		
		System.out.println("(\"��ġ�ºκл���\"); //�����͸� �����Ҷ� �ڿ������� �����ؾ��Ѵ�!");
		System.out.println("��ġ�ºκл���");
		
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
