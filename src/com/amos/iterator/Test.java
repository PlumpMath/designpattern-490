package com.amos.iterator;

public class Test {

	public static void main(String[] args) {
		// test1  ʵ��ArrayList
		// ArrayList list = new ArrayList();
		// for(int i=0;i<30;i++){
		// list.add(i);
		// }
		// System.out.println(list.size());
		//

		// test2  ʵ������
		// LinkedList list = new LinkedList();
		// for (int i = 0; i < 30; i++) {
		// list.add(i);
		// }
		// System.out.println(list.size());

		// test3 �������һ��ͨ�е������ӿ�
		// Collection list = new LinkedList();
		// for (int i = 0; i < 30; i++) {
		// list.add(i);
		// }
		// System.out.println(list.size());

		// test4 ��Ԫ�ؽ��б���
		Collection list = new LinkedList();
		for (int i = 0; i < 30; i++) {
			list.add(i);
		}
		
		for (int i = 0; i < 30; i++) {
			System.out.println(list.get(i));
		}
		
	}
}
