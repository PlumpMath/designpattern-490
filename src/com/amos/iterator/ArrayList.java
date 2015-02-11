package com.amos.iterator;

public class ArrayList implements Collection{
	Object[] objs = new Object[10];
	int index =0;
	public void add(Object o){
		if(index==objs.length){
			Object[] newObjs = new Object[objs.length*2];
			System.arraycopy(objs, 0, newObjs, 0, objs.length);
			
			objs = newObjs;
		}

		objs[index] = o;
		
		index++;
	}
	
	public int size(){
		return index;
	}

	@Override
	public Object get(int i) {
		return objs[i];
	}
	
	public Iterator iterator(){
		return new ArrayListIterator();
	}
	
	private class ArrayListIterator implements Iterator{
		
		int currentIndex=0;
		
		@Override
		public boolean hasNext() {
			if(currentIndex<index){
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			Object o = objs[currentIndex];
			currentIndex++;
			return o;
		}
	}
}