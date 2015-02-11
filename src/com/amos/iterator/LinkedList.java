package com.amos.iterator;

public class LinkedList implements Collection {

	Node head = null;
	Node tail = null;
	int size = 0;

	public void add(Object o) {
		Node n = new Node(o, null);
		if (head == null) {
			head = n;
			tail = n;
		}
		tail.setNext(n);
		tail = n;
		size++;
	}

	public int size() {
		return size;
	}

	@Override
	public Object get(int i) {
		return getData(i);
	}

	private Object getData(int i) {
		Node oo = head.getNext();
		if (i == 0) {
			oo = head;
		}
		for (int x = 1; x < i; x++) {
			oo = oo.getNext();
		}
		return oo.getData();
	}

	public Iterator<?> iterator() {

		return new Iterator() {

			int currentIndex = 0;

			@Override
			public Object next() {
				Object o = null;
				o = getData(currentIndex);
				currentIndex++;
				return o;
			}

			@Override
			public boolean hasNext() {
				if (currentIndex < size)
					return true;
				return false;
			}
		};
	}

}
